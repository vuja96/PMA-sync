package com.ftn.PMA.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Activity {
	
	@Id
	@GeneratedValue
	private long serverId;
	
	private long id;
    private String name;
    private Date date;
    private Date startTime;
    private Date endTime;
    private boolean finished = false;
    private float duration;
    private float kcalBurned;
    
    @OneToMany(targetEntity=Location.class,mappedBy="activity")
    private List<Location> locations = new ArrayList<>();
    
    @ManyToOne(fetch=FetchType.EAGER)
    private ActivityType activityType;
    
    @ManyToOne(fetch=FetchType.EAGER)
    private User user;
    
}
