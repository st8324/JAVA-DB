$(document).ready(function(){
	//pw1 : 길이 -> 내용이 변경됐을 때 체크 or
	//						  가입버튼이 눌렸을 때 체크
	$('#pw1').change(function(){
		if(!checkLength('#pw1',8,13)){
			alert('8~13자리를 입력해야합니다.');
		}
	})
	//pw2 : pw1과 같기만하면 된다 
	//			-> 내용이 변경됐을 때 체크 or
	//			   가입버튼이 눌렸을 때 체크
	$('#pw2').change(function(){
		if(!equals('#pw1','#pw2')){
			alert('비밀번호와 일치하지 않습니다. ');
		}
	});
});
function checkLength(selector,min,max){
	//select에 #을 입력안하고 순수하게 아이디명만 입력하는
	//경우 예:pw1
	//var length = $('#'+selector).val().length;
	//selector에 #을 포함한 아이디를 입력하는 경우 예:#pw1
	var length = $(selector).val().length;
	if(length > max || length < min)
		return false;
	else
		return true;
}
function equals(sel1, sel2){
	if($(sel1).val() == $(sel2).val())
		return true;
	return false;
}