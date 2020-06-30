package com.ftn.PMA.model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class GroceryAndAmountPair {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long serverId;
	
	private long id;

	@ManyToOne(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    private Grocery grocery;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	private Meal meal;
    private float amount;


}
