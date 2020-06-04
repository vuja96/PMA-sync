package com.ftnPMA.model;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Location {
	
	private int id;
    private double lon;
    private double lat;
    private Date dateAndTime;
    
}
