$(document).ready(function(){
	$('div').mouseenter(function(){
		$(this).siblings().addClass('bg-gray');
	})
	$('div').mouseout(function(){
		$(this).siblings().removeClass('bg-gray');
	})
	// $('div').hover(function(){
	// 	$(this).siblings().toggleClass('bg-gray');
	// })
});
