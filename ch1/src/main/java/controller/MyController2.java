package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController2 {

	@RequestMapping("/mm")
	public void mm() {
		System.out.println("这是mm");
	}
	
	
	
	
	
}
