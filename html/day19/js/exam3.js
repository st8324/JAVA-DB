$(document).ready(function(){
	$('div').mouseenter(function(){
		$(this).css('border-color','red');
		$(this).animate({
			width:'100px',
			height:'100px',
		},1000)
	})
	$('div').mouseout(function(){
		$(this).animate({width:'50px',height:'50px'},1000)
		$(this).css('border-color','black');
	})
});
