/* website 데이터베이스에서 카페 회원수를 쿼리문으로 수정해보세요.*/
UPDATE cafe 
SET 
    cafe_total = (SELECT 
            COUNT(*)
        FROM
            member
        WHERE
            member_cafe_name = '파산회생 무료 상담')
WHERE
    cafe_name = '파산회생 무료 상담';
    
SELECT 
    *
FROM
    cafe;