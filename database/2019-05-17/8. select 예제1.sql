/*
	A테이블의 외래키가 B테이블과 연결된 상태
	select * from A join B on A.외래키명 = B.기본키명;
*/
/* 학번이 2019160160인 학생이 수강한 목록과 학생 이름을 출력하는 쿼리를 join을 이용하여 작성하세요. 
1. 학생이름 강의번호 총점 

2. 학생이름 과목명 총점 

3. 학생이름 과목명 교수이름 총점 
*/
select  student_name, course_class_num, course_total
	from course
    join student
    on course.course_student_num = student.student_num
    where course_student_num = 2019160160;
    
    
select  student_name,  c.*
	from (select course_class_num, course_total, course_student_num 
			from course where course_student_num = 2019160160) as c
    join student
    on c.course_student_num = student.student_num;
    