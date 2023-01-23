package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="syain")
public class Syain {
    @Id
    private Integer id;
    
    private String name;
    
    private String romaji;
    
    public Integer getId() {
        return id;
    }
	public String getName() {
		return name;
	}
	public String getRomaji() {
		return romaji;
	}
}