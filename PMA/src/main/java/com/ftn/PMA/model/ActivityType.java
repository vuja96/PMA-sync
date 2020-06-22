package com.ftn.PMA.model;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class ActivityType {
	
	@Id
	@GeneratedValue
	private long id;
    private String name;
    private float met;

}
