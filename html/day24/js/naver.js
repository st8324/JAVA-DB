$(document).ready(function(){
	$('.auto-search').click(function(){
		$(this).find('.icon-auto-down').toggleClass('icon-auto-up');
		//검색창에 녹색 밑줄을 토글(제거했다 추가)하는 코드
		$('.search-input-box').toggleClass('border-bottom-none');
		$('.auto-box').slideToggle(10);
	});
	$('.realtime-search').mouseenter(function(){
		$('.realtime-search-box').addClass('display-block');
	})
	$('.realtime-search-box').mouseout(function(){
		$(this).removeClass('display-block');
	})

/*	function ticker(){
		//1초후에 f1함수를 실행해라
		setTimeout(f1, 1000);
	};
	function f1(){
		//첫번째 li태그를 0.4초동안 위로 20px올린 후 f2를 실행
		$('.realtime-search li:first')
			.animate( {marginTop: '-20px'}, 400, f2);
		//ticker()함수처럼 보이지만 일반 재귀함수랑 형태가 다르다.
		ticker();
	}
	//맨위에 있는 li태그를 잘라서 ul태그 끝에 붙이는 함수
	function f2(){
		$(this)//li태그 첫번째 요소 : $('.realtime-search li:first')
			.detach()//떼서  
			.appendTo('.realtime-search ul')//ul태그 뒤에 
			.removeAttr('style');//style="margin-top:-20px"를 제거
	}
	ticker();//ticker함수 실행
	*/
	//A.append(B);//A요소 자손들 끝에 B를 추가해라
	//A.appendTo(B);//A요소를 B자손 끝에 추가해라
	function ticker(selector,height){
		setTimeout(function(){
			$(selector+' li:first')
				.animate( {marginTop: '-'+height}, 400, function(){
					$(this)
						.detach()
						.appendTo(selector+' ul')
						.removeAttr('style');
      });
			ticker(selector,height);
		}, 1000);
	};
	ticker('.realtime-search','20px');
	ticker('.news-ticker','20px');
	$('.r2-top-btn.next').click(function(){
		var num = $('#num').text();
		num++;
		if(num==7) num = 1;
		$('#num').text(num);
	})
	$('.r2-top-btn.prev').click(function(){
		var num = $('#num').text();
		num--;
		if(num==0) num = 6;
		$('#num').text(num);
	})
	// $('.l3-item').mouseenter(function(){
	// 	$(this).parent().find('.l3-item-1').addClass('display-block');
	// 	$(this).addClass('display-none');
	// })
	// $('.l3-item-1').mouseleave(function(){
	// 	$('.l3-item').removeClass('display-none');
	// 	$('.l3-item-1').removeClass('display-block');
	// 	$(this).parent().find('.l3-item').removeClass('display-none');
		
	// })
	$('.l3-item-p').hover(function(){
		$(this).find('.l3-item-1').toggleClass('display-block');
		$(this).find('.l3-item').toggleClass('display-none');
	})

	//--------------더 보기 기능 ----------------------

	//검은색 배너의 기본 리스트를 클래스이름으로 저장
	var defaultArr = ['dic','news','stock',
						'land','map','movie','music','book','comic'];
	//메뉴 설정에서 현재 선택한 배너 리스트	
	var tmpArr =[];
	//확인을 통해 확정된 배너 리스트
	var arr = [];
	
	//arr1에 있는 내용을 arr2에 복사
	//메뉴 설정을 클릭하면 동작=>copArr(arr,tmpArr)
	//메뉴 설정에서 선택 후 확인 버튼 클릭하면 동작
	//   =>copyArr(tmpArr,arr)
	function copyArr(arr1){
		var arr2 = arr1.slice(0);
		return arr2;
	}
	//arr에 있는 값을 기준으로 checkbox의 체크 상태를 결정
	//메뉴 설정 클릭 시 동작
	function checkArr(){
		$('.setting-list input[type=checkbox]').each(function(){
			var data = $(this).val();
			if(arr.indexOf(data)>=0)
				$(this).prop('checked',true);
			else
				$(this).prop('checked',false);
		})
	}
	//메뉴설정클릭 후 체크박스를 체크또는 해제하면 해당 값을 
	//tmpArr에 반영하는 함수
	//체크 해제는 아무런 문제가 없다.
	//체크는 최대 max개이므로
	//5개 이상이면 추가하지 않고 체크된 상태를 해제된 상태로 돌려야함
	//그리고 5개이상 추가할 수 없다는 정보를 return으로 알려줌
	//obj는 값이 변경된 체크박스 요소(객체)
	function arrCheck(obj,max){
		var data = obj.val();
		var index = tmpArr.indexOf(data);
		if(index>=0){
			tmpArr.splice(index,1);
			return 1;
		}else if(tmpArr.length<max){
			tmpArr.push(data);
			return 1;
		}else{
			$(obj).prop('checked',false);
			return 0;
		}
	}
	//arr에 있는 값을 토대로 배너에 적용하는 함수
	function displayArr(){
		if(arr.length == 0){
			var i = 0;
			$('.banner-black .banner-img').each(function(){
				//기존에 불필요한 클래스 제거
				$(this).parent().removeClass('display-none');
				$(this).attr('class','banner-img');
				$(this).addClass(defaultArr[i++]);
			})
		}else{
			var i = 0;
			$('.banner-black .banner-img').each(function(){
				//기존에 불필요한 클래스 제거
				$(this).parent().removeClass('display-none');
				$(this).attr('class','banner-img');
				if(i<arr.length){
					$(this).addClass(arr[i++]);
				}else{
					$(this).parent().addClass('display-none');
				}
			})
		}
	}
	//arr.push('book');
	displayArr();
	

	//더보기 또는 접기 버튼 클릭하면 
	$('.more').click(function(){
		//접기 버튼을 누르면 박스 접기
		if($(this).hasClass('fold')){
			moreBoxClose();	
			displayArr();
		}
		//아니면 박스 열기
		else
			moreBoxOpen();
	})
	//메뉴 설정 클릭
	$('.sub1>a:nth-child(2)').click(function(){
		$('.sub1').addClass('display-none');
		$('.sub2').removeClass('display-none');
		$('.setting-list input[type=checkbox]').removeClass('display-none');
		//arr를 이용하여 박스 그리기
		drawOpenBox(arr);
	})
	//각 서브메뉴 닫기 버튼 클릭
	$('.more-sub-menu .more-close').click(function(){
		moreBoxClose();
		displayArr();
	})
	//취소버튼
	$('.sub2 a:nth-child(3)').click(function(){
		moreBoxClose();
		moreBoxOpen();
		displayArr();
	})
	//확인버튼
	$('.sub2 a:nth-child(2)').click(function(){
		//tmpArr에 있는 값을 arr에 저장
		arr = copyArr(tmpArr);
		if(arr.length == 0)
			alert('선택된 메뉴가 없습니다. 초기설정으로 돌아갑니다.');
		moreBoxClose();
		displayArr();
	})
	//초기화 버튼 
	$('.sub2 a:nth-child(1)').click(function(){
		arr = [];
		moreBoxClose();
		displayArr();
		alert('초기 설정으로 돌아갑니다.');
	});
	//체크박스 선택 시
	$('.setting-list input[type=checkbox]').change(function(){
		//체크박스 값에 따라 배열 처리 후 알람을 띄울지 말지 결정
		if(arrCheck($(this),5) == 0)
			alert('최대 5개까지 선택가능합니다.');
		//tmpArr를 이용하여 그리기
		drawOpenBox(tmpArr);

	});
	//매개변수 arr에 따라 박스를 그리는 함수
	function drawOpenBox(arr){
		//모든 배너의 클래스를 기본 클래스로 설정
		$('.banner-black .banner-img').attr('class','banner-img');
		//변수 i 생성 및 0으로 초기화
		var i = 0;
		//모든 배너의 개체 정보를 가져옴
		$('.banner-black .banner-img').each(function(){
			//내 부모에 display-none 클래스가 적용되어 있을 수 있기
			//때문에 제거
			$(this).parent().removeClass('display-none');
			//i가 arr의 길이보다 작으면 
			if(i<arr.length)
				//나에다 arr배열에 있는 클래스 추가 후 i증가
				$(this).addClass(arr[i++]);
			//i가 5보다 작으면 
			else if(i<5){
				//빈상자를 그리기위한 클래스 추가
				$(this).addClass('empty');
				//i증가
				i++;
			}
			else{
				//부모의 클래스에 display-none 추가
				$(this).parent().addClass('display-none');
			}
		})
	}

	function moreBoxOpen(){
		moreBox();
		//더보기 메뉴 열 때 arr에 있는 값을 tmpArr에 복사
		tmpArr = copyArr(arr);

		$('.sub1').removeClass('display-none');
		//arr에 있는 값을 통해 체크박스 체크 여부 결정
		checkArr();
	}
	function moreBoxClose(){
		moreBox();
		$('.sub2').addClass('display-none');
		$('.setting-list input[type=checkbox]').addClass('display-none');	
		//tmpArr 비움
		tmpArr = [];
		displayArr();
	}
	function moreBox(){
		$('.more-bg-box').toggleClass('display-none');
		$('.more-box').toggleClass('display-none');
		$('.more').toggleClass('fold');
	}
});

