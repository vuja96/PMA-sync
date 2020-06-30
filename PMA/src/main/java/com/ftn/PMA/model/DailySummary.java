package com.ftn.PMA.model;
import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DailySummary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Date day;
    private Float kcalIn;
    private Float kcalOut;
    private Float totalProtein;
    private Float totalCarb;
    private Float totalFat;

}
