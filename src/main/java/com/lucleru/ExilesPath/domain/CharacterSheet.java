package com.lucleru.exilespath.domain;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.lucleru.exilespath.dto.AttributesDto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class CharacterSheet implements  Serializable {
	@Id
	private Long id;
	private String playerName;
	private String characterName;
	private String technologicalLevel;
	private String epicPoints;
	private String character;
	private String corporation;
	private AttributesDto attributes;


}
