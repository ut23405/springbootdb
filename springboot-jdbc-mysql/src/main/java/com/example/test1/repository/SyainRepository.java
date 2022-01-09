package com.example.test1.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.example.test1.SyainDto;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class SyainRepository {
	private final JdbcTemplate jdbcTemplate;

	public List<SyainDto> getAll() {
		String sql = "select id,name,romaji from syain";
		List<Map<String, Object>> syainList = jdbcTemplate.queryForList(sql);
		List<SyainDto> list = new ArrayList<>();
		for (Map<String, Object> str1 : syainList) {
			SyainDto syain = new SyainDto();	
			syain.setId((int) str1.get("id"));
			syain.setName((String) str1.get("name"));
			syain.setRomaji((String) str1.get("romaji"));
			list.add(syain);
		}
		return list;
	}
}