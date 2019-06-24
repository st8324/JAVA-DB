$(document).ready(function(){
	//현재위치를 나타내는 전역변수(pos) 선언 초기 0
	var pos = 0;
	//다음버튼 클릭
	$('.next').click(function(){
		//1. 현재 위치를 증가
		pos++;	
		//2. 증가된 위치가 3이면 현재 위치를 2로 수정
		if(pos == 3)
			pos = 2;
		drawBox();
	})
	//이전버튼 클릭
	$('.prev').click(function(){
		//1. 현재 위치를 감소
		pos--;	
		//2. 감소된 위치가 -1이면 현재 위치를 0으로 수정
		if(pos == -1)
			pos = 0;
		drawBox();
	})
	function drawBox(){
		//3. 모든 박스에 빨간색 테두리 제거(검은색으로 변경)
		$('.box').removeClass('border-red');
		//4. 현재 위치의 박스만 빨간색 테두리 추가
		$('.box').eq(pos).addClass('border-red');
	}
});
