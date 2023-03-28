package com.example.lesson05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lesson05")
@Controller
public class Lesson05Controller {
	
	@GetMapping("/ex01")
	public String ex01() {
		return "lesson05/ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02(Model model) {
		
		// List<String>
		List<String> fruitList = new ArrayList<>();
		fruitList.add("사과");
		fruitList.add("포도");
		fruitList.add("망고");
		fruitList.add("블루베리");
		fruitList.add("딸기");
		model.addAttribute("fruits", fruitList);
		
		// List<Map>
		List<Map<String, Object>> userList = new ArrayList<>();
		Map<String, Object> user = new HashMap<>();
		user.put("name", "신짱구");
		user.put("age", "7");
		user.put("hobby", "TV보기");
		userList.add(user);
		
		user = new HashMap<>();
		user.put("name", "김철수");
		user.put("age", "7");
		user.put("hobby", "독서");
		userList.add(user);
		
		// model에 담기
		model.addAttribute("users", userList);
		return "lesson05/ex02";
	}
}
