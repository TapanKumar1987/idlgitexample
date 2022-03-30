package com.sap.chatbot.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/view")
public class ViewController {
	@RequestMapping("/downloadlink")
	public String welcome() {
		//added new view in project
		return "welcome";
	}
}
