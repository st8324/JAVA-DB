$(document).ready(function(){
	$('#more').click(function(){
		var str = '<div class="box"></div>';
		str += '<div class="box"></div>';
		str += '<div class="box"></div>';
		$(this).before(str);
	});
});