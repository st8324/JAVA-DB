/* 10. 'A 카페'에 가입된 모든 회원들의 이메일을 출력하는 쿼리문을 작성하세요. */
select user_email from member 
	join user
    on user_id = member_user_id
    where member_cafe_name = '강아지 키우기';