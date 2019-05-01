/* 4. website 데이터베이스에 있는 회원가입하는 쿼리문을 작성하세요. */
insert into 
	user(user_id,user_pw,user_email,user_nick,user_phone,user_add)
	values('a123','a123','a123@naver.com','a123','010-5678-1234','서울특별시');
SELECT * FROM website.user;