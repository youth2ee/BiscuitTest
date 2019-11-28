package com.naver.s5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/new/**")
public class NewController {
	
	@GetMapping("new")
	public void name() {
		System.out.println("dddd");
	}

}
