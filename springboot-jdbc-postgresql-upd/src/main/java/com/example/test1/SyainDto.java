package com.example.test1;

import java.time.LocalDateTime;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SyainDto {
    private Integer id;
    private String name;
    private String romaji;
    private LocalDateTime createdAt;
    private Date updatedAt;
}
