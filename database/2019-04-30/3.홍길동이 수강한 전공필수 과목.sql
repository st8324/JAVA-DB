/* 3. university 데이터베이스에서 홍길동 학생이 수강한 전공 필수 과목들을 출력하는 쿼리문을 작성해보세요.*/
SELECT 
    course_student_num,
    student.student_name,
    subject.subject_title,
    class_year,
    class_semester,
    subject_type
FROM
    course
        JOIN
    student ON student.student_num = course.course_student_num
        JOIN
    class ON course.course_class_num = class.class_num
        JOIN
    subject ON subject.subject_code = class.class_subject_code
WHERE
    student.student_name = '홍길동'
        and subject.subject_type='전공필수';