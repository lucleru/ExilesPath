package com.lucleru.exilespath.dto;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class AttributesDto  implements Serializable{
	private String charisma ;
	private String perception ;
	private String intelligence ;
	private String wish;
	private String agility ;
	private String strength;
	private String constitution ;
	private String ability ;
	
	

}
