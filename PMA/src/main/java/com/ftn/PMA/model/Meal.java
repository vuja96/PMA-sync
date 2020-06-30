package com.ftn.PMA.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Meal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long serverId;
	
	private long id;
    private Date dateAndTime;
    
    @OneToMany(targetEntity=GroceryAndAmountPair.class,mappedBy="meal",cascade = CascadeType.ALL)
    private List<GroceryAndAmountPair> groceryAndAmountPairs = new ArrayList<>();

    private String type;

    private float totalKcal;
    private float totalProtein;
    private float totalCarb;
    private float totalFat;
    
    @ManyToOne(fetch=FetchType.EAGER)
    private User user;
}
