package com.ftnPMA.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GroceryAndAmountPair {
	
	private int id;

    private Grocery grocery;
    private int groceryId;
    private int mealId;
    private float amount;


}
