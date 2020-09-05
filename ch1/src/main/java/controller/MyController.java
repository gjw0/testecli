package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	
	@RequestMapping("/my")
	public String my(Model m) {
		
		m.addAttribute("msg", "哈哈");
		
		return "my";
		
		
	}
	
	@RequestMapping("/tt")
	public String tt() {
		System.out.println("hh");
		return "tt";
	}
	@RequestMapping("/my2")
	public String my2() {
		System.out.println("你好");
		return "my2";
	}
	
	
	
	
}