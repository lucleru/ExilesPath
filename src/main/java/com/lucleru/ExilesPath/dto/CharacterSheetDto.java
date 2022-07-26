package com.lucleru.ExilesPath.dto;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class CharacterSheetDto extends AbstractDto<Long>  implements Serializable {
	
	private String playerName;
	private String characterName;
	private String technologicalLevel;
	private String epicPoints;
	private String character;
	private String corporation;
	private AttributesDto attributes;

}
