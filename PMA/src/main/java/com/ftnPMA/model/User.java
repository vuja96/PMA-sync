package com.ftnPMA.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	private String email;
    private String password;
    private float weight;
    private float height;
    private int age;
    private boolean isSynced = false;	

}
