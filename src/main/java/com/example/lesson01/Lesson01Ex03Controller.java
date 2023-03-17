package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller		// ***** jsp로 뿌릴 때는 @Controller만 된다.
public class Lesson01Ex03Controller {
	
	@RequestMapping("/lesson01/ex03")	// return 값과는 아무 연관없다.
	public String ex03() {
		// @ResponseBody없이 단독 @Controller만 사용되는 경우
		// return String(view 경로) ViewResolver에 의해 jsp 경로를 찾는다.
		
		// return "/WEB-INF/jsp/lesson01/ex03.jsp";	// jsp view 경로
		// application.propertis에 있는 prefix와 suffix 제외한 경로만 쓴다.
		return "lesson01/ex03";	// jsp view 경로
	}
}
