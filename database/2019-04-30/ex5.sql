/* website 데이터베이스에서 asdf회원이 강아지키우기 카페에 등록한 글의 갯수를 쿼리문으로 수정해보세요.*/
update member
	set member_board_count 
		= (select count(*) from board 
        where board_writer ='abcd' and board_cafe_name='강아지 키우기')
	where member_no>=1 and member_user_id='abcd' and member_cafe_name='강아지 키우기';
select * from member;