package com.example.test1;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SyainDto {
    private int id;
    private String name;
    private String romaji;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
