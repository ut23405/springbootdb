package com.example.test1;

import java.util.ArrayList;
import java.util.List;
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
		// 登録データの作成
		List<SyainDto> syainList = new ArrayList<>();
		syainList.add(new SyainDto(11, "鈴木", "suzuki"));
		syainList.add(new SyainDto(12, "田中", "tanaka"));

		try {
			syainService.updateData(syainList);
		}catch(Exception e) {
			System.out.println(e);
		}
		return "test1/index";
	}
}
