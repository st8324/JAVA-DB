/* 1. website 데이터베이스에 있는 board(게시판) 테이블에 views(조회수) 
속성을 추가 한 후 update를 이용하여 1번 게시판의 조회수를 1 증가하는 쿼리문을 작성하세요.*/
update board
	set board_views = board_views+1
    where board_no = 1;
select * from board;