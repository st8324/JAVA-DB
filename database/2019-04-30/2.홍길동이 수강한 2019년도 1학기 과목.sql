/* 2. university 데이터베이스에서 홍길동 학생의 2019년도 1학기 수강 과목들을 출력하는 쿼리문을 작성해보세요. */
SELECT 
    course_student_num,
    student.student_name,
    subject.subject_title,
    class_year,
    class_semester
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
        AND class_year = 2019
        AND class_semester = 1;