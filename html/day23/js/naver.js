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

	//더보기 또는 접기 버튼 클릭하면 
	$('.more').click(function(){
		//접기 버튼을 누르면 박스 접기
		if($(this).hasClass('fold')){
			moreBoxClose();	
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
	})
	//각 서브메뉴 닫기 버튼 클릭
	$('.more-sub-menu .more-close').click(function(){
		moreBoxClose();
	})
	//취소버튼
	$('.sub2 a:nth-child(3)').click(function(){
		moreBoxClose();
		moreBoxOpen();
	})
	function moreBoxOpen(){
		moreBox();
		$('.sub1').removeClass('display-none');
	}
	function moreBoxClose(){
		moreBox();
		$('.sub2').addClass('display-none');
		$('.setting-list input[type=checkbox]').addClass('display-none');	
	}
	function moreBox(){
		$('.more-bg-box').toggleClass('display-none');
		$('.more-box').toggleClass('display-none');
		$('.more').toggleClass('fold');
	}
});

