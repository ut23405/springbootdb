package com.example.test1;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SyainDto {
    private BigDecimal id;
    private String name;
    private String romaji;
    private Date createdAt;
    private Date updatedAt;
}
