package com.example.test1;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.test1.repository.SyainRepository;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MainController {
    private final SyainRepository syainRepository;
    
	@GetMapping("/test1")
	public String write1(Model model) {
		List<SyainDto> list = syainRepository.getAll();
		model.addAttribute("SyainList",list);
		return "test1/index";
	}
}
