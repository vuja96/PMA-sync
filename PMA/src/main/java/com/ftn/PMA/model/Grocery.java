package com.ftn.PMA.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Grocery {
	
	@Id
	@GeneratedValue
	private long id;
    private String name;
    private float kcalPer100gr;
    private float proteinPer100gr;
    private float carbPer100gr;
    private float fatPer100gr;
    
    private boolean expanded = false;

}
