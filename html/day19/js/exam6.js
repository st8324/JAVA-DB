$(document).ready(function(){
	$('tr').click(function(){
		//1. 현재 위치 확인
		var pos = $(this).attr('value');
		//2. 현재 위치에 있는 체크박스 개체정보 가져오기
		var obj =$('tr input[type=checkbox]').eq(pos);
		//3. 현재 체크박스의 체크 상태 가져오기
		var isChecked = obj.prop('checked');
		//4. 현재 체크박스 개체 정보에 체크박스 상태 반대로 만들기
		obj.prop('checked',!isChecked);
	})
	$('tr input[type=checkbox]').click(function(){
		var isChecked = $(this).prop('checked');
		$(this).prop('checked',!isChecked);
	});
});
