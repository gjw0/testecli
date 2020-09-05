package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController4 {
	
	@RequestMapping("/a")
	public void sa() {
		
		System.out.println("aa");
		
	}
	
	
}
