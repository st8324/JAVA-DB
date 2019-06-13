function checkPwConfirm(idPw1, idPw2,min,max){
	var pw1 = document.getElementById(idPw1).value;
	var pw2 = document.getElementById(idPw2).value;
	//비밀번호 id값을 이용하여 에러메세지 박스(html코드에서 div)
	//아이디 만들기
	var strErrorPw1 = 'error'+idPw1;
	var strErrorPw2 = 'error'+idPw2;
	//에러메세지 아이디를 이용하여 에러메세지를 화면에 추가
	document.getElementById(strErrorPw1).innerHTML ='에러';
	document.getElementById(strErrorPw2).innerHTML ='에러';

	if(!checkPw(pw1,min,max))
		return;

	if(pw1 == pw2){
		alert('비밀번호가 일치합니다.');
		return;
	}
	else{
		alert('비밀번호가 일치하지 않습니다.');
		return ;
	}
}
function checkStringLength(str, min, max){
	if(str.length > max || str.length < min)
		return false;
	return true;
}
function checkPw(str,min,max){
	if(!checkStringLength(str,min,max)){
		alert('비밀번호는 '+min+'~'+max+'자리입니다.');
		return false;
	}
	return true;
}
