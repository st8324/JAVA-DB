/*
	A테이블의 외래키가 B테이블과 연결된 상태
	select * from A join B on A.외래키명 = B.기본키명;
*/
/* 학번이 2019160160인 학생이 수강한 목록과 학생 이름을 출력하는 쿼리를 join을 이용하여 작성하세요. 
1. 학생이름 강의번호 총점 

2. 학생이름 과목명 총점 

3. 학생이름 과목명 교수이름 총점 
*/
select  student_name,subject_title,  course_total, professor_name
	from (select * 
			from course where course_student_num = 2019160160) as c
    join student
    on course_student_num = student_num
    join class
    on class_num = course_class_num
    join subject
    on subject_code = class_subject_code
    join professor
    on professor_num = class_professor_num;