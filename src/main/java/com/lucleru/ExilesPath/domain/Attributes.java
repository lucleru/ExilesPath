package com.lucleru.exilespath.domain;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Attributes  implements Serializable{
	private String charisma;
	private String perception;
	private String intelligence;
	private String wish;
	private String agility ;
	private String strength;
	private String constitution ;
	private String ability;
	
	

}
