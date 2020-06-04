package com.ftnPMA.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivityType {
	
	private int id;
    private String name;
    private float met;

}
