<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
	<script type="text/javascript" src="//code.jquery.com/jquery-3.4.1.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery.validate.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/additional-methods.js"></script>	
	<title>회원가입</title>
	<style>
	*{
		margin: 0;
		padding : 0;
	}
	.main{
		margin-top:50px;
	}
	.row{
		margin: 5px 0px;
	}
	.fab.fa-amazon{
		font-size: 100px;
		color: red;
	}
	</style>
	<script type="text/javascript">
	function checkSame(sel1, sel2){
		var val1 = $(sel1).val();
		var val2 = $(sel2).val();
		if(val1 == val2)
			return true;
		return false;
	}
	function checkLength(sel,min,max){
		var val = $(sel).val();
		if(val.length >= min && val.length <= max )
			return true;
		return false;
	}
	
	var isCheck = false;
	
	$(document).ready(function(){
		
		$('#signup').submit(function(){
			if(!checkLength('#signup input[name=id]',8,13)){
				alert('아이디는 8~13자리입니다.');
				return false;
			}
			var regex = /^\w*(\d[A-z]|[A-z]\d)\w*$/;
			var id = $('input[name=id]').val();
			if(!regex.test(id)){
				alert('아이디는 영문자와 숫자를 반드시 1개이상 포함해야 합니다.');
				return false;
			}
			if(!isCheck){
				alert('아이디 중복검사를 하세요.');
				return false;
			}
			if(!checkLength('#signup input[name=pw]',8,13)){
				alert('비밀번호는 8~13자리입니다.')
				return false;
			}
			if(!checkSame('#signup input[name=pw]','#signup input[name=pw2]')){
				alert('비밀번호와 일치하지 않습니다.')
				return false;
			}
			if($('#signup input[type=email]').val().length == 0){
				alert('이메일을 입력해주세요.')
				return false;
			}
			alert('회원가입에 성공했습니다.');
			return true;
		})	
		
		$('#dup').click(function(){
			var id = $('input[name=id]').val();
			//id 유효성 검사
			
			$.ajax({
	        async:true,
	        type:'POST',
	        data:id,
	        url:"dup",
	        dataType:"json",
	        contentType:"application/json; charset=UTF-8",
	        success : function(data){
	            if(!data.isMember){
	            	alert('회원 가입이 가능한 아이디입니다.');
	            	isCheck = true;
	            }else{
	            	alert('이미 가입된 회원입니다.');
	            	isCheck = false;
	            }
	        }
	    });
		})
		$('input[name=id]').change(function(){
			isCheck = false;
		})
		$("form").validate({
	        rules: {
	            id: {
	                required : true,
	                minlength : 8,
	                maxlength : 20
	            },
	            pw: {
	                required : true,
	                minlength : 8,
	                maxlength : 20,
	                regex: /^\w*(\d[A-z]|[A-z]\d)\w*$/
	            },
	            pw2: {
	                required : true,
	                equalTo : pw
	            },
	            email: {
	                required : true,
	                email : true
	            }
	        },
	        //규칙체크 실패시 출력될 메시지
	        messages : {
	            id: {
	                required : "필수로입력하세요",
	                minlength : "최소 {0}글자이상이어야 합니다",
	                maxlength : "최대 {0}글자이하이어야 합니다"
	            },
	            pw: {
	                required : "필수로입력하세요",
	                minlength : "최소 {0}글자이상이어야 합니다",
	                maxlength : "최대 {0}글자이하이어야 합니다",
	                regex : "영문자, 숫자로 이루어져있으며 최소 하나이상 포함"
	            },
	            pw2: {
	                required : "필수로입력하세요",
	                equalTo : "비밀번호가 일치하지 않습니다."
	            },
	            email: {
	                required : "필수로입력하세요",
	                email : "메일규칙에 어긋납니다"
	            }
	        }
	    });
	})
	$.validator.addMethod(
    "regex",
    function(value, element, regexp) {
        var re = new RegExp(regexp);
        return this.optional(element) || re.test(value);
    },
    "Please check your input."
	);
	</script>
</head>
<body>
	<div>
		<div class="offset-4 col-4 border border-dark mt-5">
			<h1 class="text-center">회원가입</h1>
			<form method="post" action="" id="signup">
				<div class="row">
					<label class="col-4">아이디</label>
					<input type="text"class="form-control col-7" placeholder="아이디" name="id">
				</div>
				<div class="row">
					<label id="id-error" class="offset-4 col-7 error p-0" for="id"></label>
				</div>
				<div>
					<button type="button" class="btn btn-outline-success offset-4 col-7" id="dup">아이디 중복확인</button>
				</div>
				<div class="row">
					<label class="col-4">비밀번호</label>
					<input type="password"class="form-control col-7" placeholder="비밀번호" name="pw" id="pw">
				</div>
				<div class="row">
					<label class="col-4">비밀번호확인</label>
					<input type="password"class="form-control col-7" placeholder="비밀번호확인" name="pw2">
				</div>
				<div class="row">
					<label class="col-4">성별</label>
					<div class="col-8">
						<label class="form-check-label col-5">
							<input type="radio" class="form-check-input" name="gender" value="M" checked>남성
						</label>
						<label class="form-check-label">
							<input type="radio" class="form-check-input" name="gender" value="F">여성
						</label>
					</div>
				</div>
				<div class="row">
					<label class="col-4">이메일</label>
					<input type="email"class="form-control col-7" placeholder="이메일" name="email">
				</div>
				<div class="offset-8 col-3 clearfix p-0">
					<button class="btn btn-primary float-right">가입</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>