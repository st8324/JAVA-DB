/* 2. website 데이터베이스에 있는 board(게시판) 테이블에 
	  게시글을 추가하는 쿼리문을 작성하세요.*/
insert into 
	board(board_title, 
		board_contents, 
        board_category_code, 
        board_cafe_name, 
        board_writer)
	values('강아지 간식 구매', 		/* 게시판 제목*/
		'강아지 간식 구매합니다.', 	/* 게시판 내용 */
        'bse001', 				/* 게시판 유형으로 게시판마다 미리 지정된 값을 저장 */
        '강아지 키우기', 			/* 카페 이름 */
        'asdf'); 				/* 로그인한 회원 id*/
update member
	set member_board_count 
		= 
        /* member_board_count = member_board_count + 1 */
        (select count(*) from board 
        where board_writer ='asdf' and board_cafe_name='강아지 키우기')
	where member_no>=1 and member_user_id='asdf' and member_cafe_name='강아지 키우기';