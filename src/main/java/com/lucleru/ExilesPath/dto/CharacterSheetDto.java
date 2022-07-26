package com.lucleru.ExilesPath.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class CharacterSheetDto {
	
	private String playerName;
	private String characterName;
	private String technologicalLevel;
	private String epicPoints;
	private String character;
	private String corporation;
	private AttributesDto attributes;

}
