package com.ftnPMA.model;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Activity {
	
	private int id;
    private String name;
    private String userId;
    private Date date;
    private Date startTime;
    private Date endTime;
    private boolean finished = false;
    private float duration;
    private float kcalBurned;
    
    List<Location> locations;
    
}
