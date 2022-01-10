package com.example.test1.service;

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
	public void updateData(List<SyainDto> syainList) {
		syainRepository.updateSyain(); // 更新
		syainRepository.insertSyain(syainList); // 登録
		syainRepository.deleteSyain(syainList.get(0)); // 削除
	}
}
