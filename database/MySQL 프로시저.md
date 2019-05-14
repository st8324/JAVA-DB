# MySQL 프로시저

* 프로시저는 일련의 쿼리를 마치 하나의 함수처럼 실행하기 위한 쿼리의 집합이다. 

  [위키백과]: https://ko.wikipedia.org/wiki/%EC%A0%80%EC%9E%A5_%ED%94%84%EB%A1%9C%EC%8B%9C%EC%A0%80

* 프로시저는 다음과 같은 장점이 있다. 

  1. 하나의 요청으로 여러 SQL문을 실행할 수 있다.(네트워크에 대한 부하를 줄일 수 있다.)
  2. 미리 구문 분석 및 내부 중간 코드로 변환을 끝내야 하므로 처리 시간이 줄어든다.
  3. 데이터베이스 트리거와 결합하여 복잡한 규칙에 의한 데이터의 참조무결성 유지가 가능하게 된다. 간단히 말하면 응용 프로그램 측 로직을 가지지 않고도 데이터베이스의 데이터 앞뒤가 맞게 될 수 있다.
  4. 보수성이 뛰어 나다.

* 프로시저는 다음과 같은 단점이 있다.

  1. 코드 자산으로서의 재사용성이 나쁘다.
  2. 업무의 사양 변경 시 외부 응용 프로그램과 할께 프로시저의 정의를 변경할 필요가 있다.

### MySQL 프로시저 목록 확인

``` mysql
mysql> show procedure status;
```

### MySQL 프로시저 스크립트 확인방법

```mysql
mysql> show create procedure 프로시저명;
```

### MySQL 프로시저 정의

```mysql
DROP PROCEDURE IF EXISTS procedure_name; -- 이미 프로시저가 정의 되어 있다면 삭제
DELIMITER // --//대신 다른 문자로 대체 가능
CREATE PROCEDURE procedure_name
 ([
   [ IN | OUT ] parameter_name
  { parameter_type | ARRAY OF parameter_type }, ...
])
[ DECLARE variable_declaration;...[;] ]
BEGIN
 procedure_body_statement;...[;]
END //
DELIMITER ;
```

* 예시 : 유저 정보 확인하는 프로시저

```mysql
DROP PROCEDURE IF EXISTS search_user;
DELIMITER //
CREATE PROCEDURE search_user()
BEGIN
	SELECT USER,HOST FROM MYSQL.USER;
END //
DELIMITER ;
```

* 예시 : 강의를 수강하는 학생 정수를 입력시 학점을 계산하는 프로시저

``` mysql
DROP TABLE IF EXISTS course;
-- course 테이블 생성
CREATE TABLE `course` (
  `course_num` int(11) NOT NULL AUTO_INCREMENT COMMENT '수강번호',
  `course_student_num` int(11) DEFAULT NULL COMMENT '학번',
  `course_class_num` int(11) DEFAULT NULL COMMENT '강의번호',
  `course_mid` double DEFAULT NULL COMMENT '중간성적',
  `course_end` double DEFAULT NULL COMMENT '기말성적',
  `course_attendance` int(11) DEFAULT NULL COMMENT '출석점수',
  `course_report` double DEFAULT NULL COMMENT '과제점수',
  `course_total` double DEFAULT NULL COMMENT '총점',
  `course_grade` varchar(2) NOT NULL DEFAULT 'F',
  PRIMARY KEY (`course_num`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='수강'
```

```mysql
DROP PROCEDURE IF EXISTS calculate_grade;
DELIMITER //
CREATE PROCEDURE calculate_grade(
	IN in_mid DOUBLE,
    IN in_end DOUBLE,
    IN in_att INT,
    IN in_rep INT,
    IN in_class_num INT,
    IN in_student_num INT
)
BEGIN
	DECLARE total	DOUBLE DEFAULT 0;
    DECLARE grade	VARCHAR(2);
    SET total = in_mid + in_end + in_att + in_rep;
    IF total >= 95 AND total <= 100 THEN 
		SET grade = 'A+';
	END IF;
	IF total >=90 AND total < 95 THEN
		SET grade = 'A';
	END IF;
    IF total >=85 AND total < 90 THEN
		SET grade = 'B+';
	END IF;
    IF total >=80 AND total < 85 THEN
		SET grade = 'B';
	END IF;
    IF total >=75 AND total < 80 THEN
		SET grade = 'C+';
	END IF;
    IF total >=70 AND total < 75 THEN
		SET grade = 'C';
	END IF;
    IF total >=65 AND total < 70 THEN
		SET grade = 'D+';
	END IF;
    IF total >=60 AND total < 65 THEN
		SET grade = 'D';
	END IF;
    IF total >=0 AND total < 60 THEN
		SET grade = 'F';
	END IF;
	UPDATE 
		university.course
	SET
		course_mid = in_mid,
        course_end = in_end,
        course_report = in_rep,
        course_attendance = in_att,
        course_total = total,
        course_grade = grade
	WHERE course_student_num = in_student_num AND course_class_num = in_class_num AND course_num >= 1;
END //
DELIMITER ;
```

### 프로시저 호출

``` mysql
CALL 프로시저명(매개변수들);
```

* 예시 : 학번이 2019160160이고 수강 과목 번호가 1번인 데이터가 있다고 가정

``` mysql
CALL calculate_grade(40.0, 30.0, 9,9,1,2019160160);
SELECT * FROM course;
```

### 용어 정리

#### DELIMITER 

*  프로시저나 트리거에서 사용된다. 
* 프로시저를 생성할 때 프로시저 안에 있는 쿼리들이 ;으로 인해 실행되면 안되기 때문에 이를 막기 위해 DELIMITER를 이용하여 DELIMITER를 이용하여 지정된 문자가 나타나기 전까지는 ;을 만나도 실행되지 않게 막아준다.

#### IN

* 프로시저를 호출하기 위해 필요한 정보들로 함수의 매개변수(인자)에 해당한다.

#### DECLARE

* 프로시저 내부에서 사용하는 변수를 선언할 때 사용한다.

#### SET

* 변수의 값을 설정할 때 사용한다.

#### IF 조건식 THEN 실행문 ELSE 실행문 END IF;

* if문에 해당하며 유의사항으로 else if문을 처리할 땐 다음과 같이 처리해야 한다.

* ``` mysql
  IF total >= 95 AND total <= 100 THEN 
  		SET grade = 'A+';
  ELSE 
  	IF total >= 90 THEN
  		SET grade = 'A';
  	END IF;
  END IF;
  ```