/* 8-1. '카페 A'에 등록된 모든 게시물들을 출력하는 쿼리를 작성하세요.(전체 정보) */

select * 
	from board 
	where board_cafe_name = '스타워즈';

/* 8-2. '카페 A'에 등록된 게시물 중 제목에 '단어'가 포함된 게시물들를 출력하는 쿼리를 작성하세요.(전체 정보) */

select * 
	from board 
	where board_cafe_name = '스타워즈'
		and board_title like '%가입%';