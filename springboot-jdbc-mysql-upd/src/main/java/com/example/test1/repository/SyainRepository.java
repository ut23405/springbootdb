package com.example.test1.repository;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.example.test1.SyainDto;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class SyainRepository {
	private final JdbcTemplate jdbcTemplate;

	public void insertSyain(List<SyainDto> syainList) {
		for (SyainDto syain : syainList) {
			jdbcTemplate.update(
					"INSERT INTO syain"
					+ "(id,name,romaji,created_at,updated_at) "
					+ "Values(?,?,?,?,?)",
					syain.getId(), syain.getName(),syain.getRomaji(),
					syain.getCreatedAt(),syain.getUpdatedAt());
		}
	}

	public void updateSyain() {
		jdbcTemplate.update(
				"UPDATE syain SET name = ? ,romaji = ? where id = ?",
				"testName", "testRomaji", 2);
	}

	public void deleteSyain(SyainDto syainList) {
		jdbcTemplate.update("DELETE FROM syain where id = ?" ,
				syainList.getId());
	}
}