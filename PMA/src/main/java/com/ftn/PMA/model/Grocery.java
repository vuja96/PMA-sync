package com.ftn.PMA.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Grocery {
	
	private int id;
    private String name;
    private float kcalPer100gr;
    private float proteinPer100gr;
    private float carbPer100gr;
    private float fatPer100gr;
    
    private boolean expanded = false;

}
