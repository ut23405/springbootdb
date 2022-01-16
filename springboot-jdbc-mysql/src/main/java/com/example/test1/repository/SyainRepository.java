package com.example.test1.repository;

import java.time.LocalDateTime;
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
		String sql = "select id,name,romaji,created_at,updated_at from syain";
		List<Map<String, Object>> syainList = jdbcTemplate.queryForList(sql);
		List<SyainDto> list = new ArrayList<>();
		for (Map<String, Object> syain : syainList) {
			list.add(new SyainDto(
					(int) syain.get("id"),
					(String) syain.get("name"),
					(String) syain.get("romaji"),
					(LocalDateTime) syain.get("created_at"),
					(LocalDateTime) syain.get("updated_at")));
		}
		return list;
	}
}