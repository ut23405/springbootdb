package com.example.demo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@Autowired
	private SyainRepository syainRepository;

	@GetMapping("/test1")
	public List<Syain> get() {
		return syainRepository.findAll();
	}
}