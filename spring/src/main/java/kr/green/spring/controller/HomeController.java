package kr.green.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.green.spring.service.MemberService;
import kr.green.spring.vo.MemberVO;

/**
 * Handles requests for the application home page.
 */
//컨트롤러 어노테이션으로 @Controller가 붙으면 컨트롤러로 인식
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	MemberService memberService;
	
	//서버부분을 제외한 URL이 /이고, 방식이 get이면 home 메소드를 실행
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("메인페이지 실행");
		
		return "home";
	}
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signupGet(Model model) {
		logger.info("회원가입페이지 실행");
		
		return "signup";
	}
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signupPost(MemberVO mVo) {
		logger.info("회원가입 진행중");
		
		if(memberService.signup(mVo))
			return "redirect:/";
		else
			return "redirect:/signup";
	}
	
}
