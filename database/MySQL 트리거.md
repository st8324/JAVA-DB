# MySQL 트리거

* 참조 : 위키
* 트리거(Trigger)는 테이블에 대한 이벤트에 반응해 자동으로 실행되는 작업을 의미한다.
* 트리거를 사용하면 참조 무결성을 지킬수 있다. => **연관된 테이블 간의 데이터 일관성을 유지할 수 있다.**
* 트리거에는 크게 행 트리거와 문장 트리거의 두 종류가 있다.
  * 행 트리거 : 테이블 안의 영향을 받은 행 각각에 대해 실행된다. 변경 전 또는 변경 후의 행은 OLD, NEW라는 가상 줄 변수를 사용하여 읽을 수 있다.
  * 문장 트리거 : INSERT, UPDATE, DELETE 문에 대해 한번만 실행된다.
* 트리거의 속성
  * BEFORE 또는 AFTER : 트리거가 실행되는 시기를 지정
  * INSTEAD OF : 트리거를 원래 문장 대신 수행
  * WHEN : 트리거를 시작하는 조건식을 지정
* 트리거는 INSERT, UPDATE, UPDATE OF, DELETE의 경우에 시작되고 SELECT 문에 의한 데이터 검색에 영향을 미칠 수 없다.

### MySQL 트리거

* INSERT, UPDATE, DELETE의 경우에 트리거 지원

* MySQL은 각 테이블에 각 형태의 다양한 트리거를 허용한다. 

* 문법

* ``` mysql
  DELIMITER //
  CREATE
      [DEFINER = user]
      TRIGGER trigger_name
      trigger_time trigger_event
      ON tbl_name FOR EACH ROW
      [trigger_order]
      BEGIN
      trigger_body
      END //
      /*
      trigger_time: { BEFORE | AFTER }
      
      trigger_event: { INSERT | UPDATE | DELETE }
      
      trigger_order: { FOLLOWS | PRECEDES } other_trigger_name
      */
  DELIMITER ;
  
  ```

### 간단한 예제

* green 데이터베이스를 생성하여 class 테이블과 course 테이블을 생성하였다.

#### 테이블 생성

* class 테이블 : 강의 테이블로 강의번호, 강의명, 총 수강생 수를 가지고 있다.

* ```mysql
  CREATE TABLE `class` (
    `no` int(11) NOT NULL,
    `name` varchar(45) DEFAULT NULL,
    `total` int(11) NOT NULL DEFAULT '0',
    PRIMARY KEY (`no`)
  ) ENGINE=InnoDB DEFAULT CHARSET=utf8
  ```

* course 테이블 : 수강 테이블로 수강번호, 강의번호, 학생번호를 가지고 있으며 강의번호를 외래키로 지정하였다.

* ``` mysql
  CREATE TABLE `course` (
    `no` int(11) NOT NULL,
    `class_no` int(11) NOT NULL,
    `student_no` int(11) NOT NULL,
    KEY `class_no_idx` (`no`),
    CONSTRAINT `class_no` FOREIGN KEY (`no`) REFERENCES `class` (`no`) ON DELETE NO ACTION ON UPDATE NO ACTION
  ) ENGINE=InnoDB DEFAULT CHARSET=utf8
  ```

* input_course 트리거 : 학생이 수강에 등록되면 해당 강의번호의 총 수강생 수가 증가해야 하기 때문에 이를 트리거로 생성하였다.

#### 트리거 생성

* ``` mysql
  use green;
  DROP TRIGGER IF EXISTS input_course;
  DELIMITER //
  CREATE TRIGGER input_course AFTER INSERT ON course
  FOR EACH ROW 
  BEGIN
  declare _total int default 0;
  set _total = (select count(*) from course where new.class_no = class_no);
  update 
  	class
  set
  	total = _total
  where
  	no = new.class_no;
  END//
  DELIMITER ;
  
  ```

#### 트리거 확인

* ````mysql
  show triggers;
  ````

#### 테스트

* ```mysql
  insert into class(no,name,total) values(1,'컴퓨터공학',0);
  insert into course(no,class_no,student_no) values(1, 1, 2019160135);
  SELECT * FROM green.class;
  ```

* class 테이블에 total에 1이 입력된 것을 확인 할 수 있다.



### 트리거와 프로시저

1. 트리거 이벤트(INSERT | UPDATE | DELETE)가 실행된 테이블을 트리거를 통해 수정하려 하면 에러 발생 > 이러한 경우에는 프로시저로 처리해야함
   * 예를 들어 A 테이블에 INSERT 트리거를 생성하는 과정에서 트리거 처리에서 A테이블을 UPDATE를 하게 되는 경우 에러가 발생한다. 이러한 경우에는 프로시저로 처리해야한다.
2. 트리거는 매 이벤트(INSERT | UPDATE | DELETE)마다 동일하게 처리하여 적용하는 경우 사용하고 프로시저는 그렇지 않은 경우 사용한다
   * 예를 들어 통신사가 회원 등급을 결정할 때 전년도 사용 비용을 기준으로 처리하기 때문에 회원 등급을 결정하는 처리를 트리거가 아닌 프로시저로 해야한다.

