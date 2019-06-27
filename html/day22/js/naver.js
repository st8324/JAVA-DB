$(document).ready(function(){
	$('.auto-search').click(function(){
		$(this).find('.icon-auto-down').toggleClass('icon-auto-up');
		//검색창에 녹색 밑줄을 토글(제거했다 추가)하는 코드
		$('.search-input-box').toggleClass('border-bottom-none');
		$('.auto-box').slideToggle(10);
	});
})