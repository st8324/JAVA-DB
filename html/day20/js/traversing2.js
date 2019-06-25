$(document).ready(function(){
	$('tr').click(function(){
		//2. 현재 이벤트가 발생한 tr 안에 있는 체크박스 가져오기
		var obj = $(this).find('input[type=checkbox');
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
