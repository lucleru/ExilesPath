package com.lucleru.ExilesPath.dto;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class AttributesDto extends AbstractDto<Long>  implements Serializable{
	private String charisma ;
	private String perception ;
	private String intelligence ;
	private String wish;
	private String agility ;
	private String strength;
	private String constitution ;
	private String ability ;
	
	

}
