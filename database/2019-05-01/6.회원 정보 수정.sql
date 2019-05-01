/* 6. website 데이터베이스에 있는 회원정보를 수정하는 쿼리문을 작성하세요. */
update user set
	user_pw = '1234',
    user_email = '1234@naver.com',
    user_nick = 'a123',
    user_add = '서울특별시'
	where user_id = 'a123';
select * from user;
