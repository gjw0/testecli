package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	
	@RequestMapping("/my")
	public String my(Model m) {
		
		m.addAttribute("msg", "鍝堝搱");
		
		return "my";
		
		
	}
	
}