package com.example.test1.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.test1.SyainDto;
import com.example.test1.repository.SyainRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SyainService {
	private final SyainRepository syainRepository;

	@Transactional
	public void updateData() {
		// 登録データの作成
		List<SyainDto> syainList = new ArrayList<>();
		LocalDateTime dateTimeNow = LocalDateTime.now();

		syainList.add(new SyainDto(
				1, "鈴木", "suzuki",dateTimeNow,dateTimeNow));
		syainList.add(new SyainDto(
				2, "田中", "tanaka",dateTimeNow,dateTimeNow));
		syainList.add(new SyainDto(
				3, "佐藤", "sato",dateTimeNow,dateTimeNow));
		
		syainRepository.updateSyain(); // 更新
		syainRepository.insertSyain(syainList); // 登録
		syainRepository.deleteSyain(syainList.get(0)); // 削除
	}
}
