package kr.green.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
//컨트롤러 어노테이션으로 @Controller가 붙으면 컨트롤러로 인식
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	//서버부분을 제외한 URL이 /이고, 방식이 get이면 home 메소드를 실행
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model, Integer num1, Integer num2,Integer count) {
		logger.info("메인페이지 실행");
		
		if(num1 != null && num2 != null) {
			model.addAttribute("c", num1+num2);
		}
		if(count == null) 
			count = 0;
		else 
			count++;
		
		model.addAttribute("a", num1);
		model.addAttribute("b", num2);
		model.addAttribute("count", count);
		return "home";
	}
	
}
