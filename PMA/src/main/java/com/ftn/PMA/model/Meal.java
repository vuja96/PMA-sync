package com.ftn.PMA.model;
import java.util.ArrayList;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Meal {
	
	private int id;
    private Date dateAndTime;
    private ArrayList<GroceryAndAmountPair> groceryAndAmountPairs = new ArrayList<>();

    private String type;

    private float totalKcal;
    private float totalProtein;
    private float totalCarb;
    private float totalFat;

}
