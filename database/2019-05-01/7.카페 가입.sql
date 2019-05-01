insert into
	member(member_cafe_name,
			member_user_id,
            member_grade)
	values('스타워즈',	/* 카페이름 */ 
			'a123', 	/* 회원이름 */
			'씨앗');		/* 회원 등급으로 카페이 기본 등급*/	
update cafe set
	/* cafe_total = cafe_tatal+1 */
	cafe_total = (SELECT 
            COUNT(*)
        FROM
            member
        WHERE
            member_cafe_name = '스타워즈')
	WHERE
		cafe_name = '스타워즈';
select * from cafe;
