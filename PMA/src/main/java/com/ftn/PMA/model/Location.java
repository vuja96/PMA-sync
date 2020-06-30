package com.ftn.PMA.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Location {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long serverId;
	
	private long id;
    private double lon;
    private double lat;
    private Date dateAndTime;
    private String userEmail;
    
    @ManyToOne(fetch=FetchType.EAGER)
    private Activity activity;
    
}
