/*1. 신입생들의 학생수를 출력하는 쿼리문을 작성해보세요.*/

SELECT 
    count(*)
FROM
    student
    /* student_num가 int일 때 */
    where student_num >= 2019000000;
    /* student_num가 varchar일 때 */
    /* where student_num like '2019%'; */