package com.example.test1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.test1.service.SyainService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MainController {
	private final SyainService syainService;

	@GetMapping("/test1")
	public String write1(Model model) {
		try {
			syainService.updateData();
		}catch(Exception e) {
			System.out.println(e);
		}
		return "test1/index";
	}
}
