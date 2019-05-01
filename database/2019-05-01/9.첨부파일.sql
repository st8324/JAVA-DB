/* 업로드 파일 데이터를 추가
	9-1. 등록된 '게시물1'에 첨부된 파일리스트를 출력하는 쿼리문을 작성하세요.
    9-2. 'asdf' 회원이 'A 카페'에 등록한 첨부 파일 리스트를 출력하는 쿼리문을 작성하세요.
*/
SELECT upload_filename FROM upload
	WHERE upload_board_no = 1;
    
    
SELECT upload_filename FROM upload
	JOIN board
    on upload_board_no = board_no
    WHERE board_writer = 'asdf' and board_cafe_name='강아지 키우기';
