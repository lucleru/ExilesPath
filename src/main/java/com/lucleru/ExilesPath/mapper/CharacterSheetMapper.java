package com.lucleru.ExilesPath.mapper;

import org.mapstruct.Mapper;

import com.lucleru.ExilesPath.domain.CharacterSheet;
import com.lucleru.ExilesPath.dto.CharacterSheetDto;

@Mapper
public interface CharacterSheetMapper extends AbstractMapper<CharacterSheet, CharacterSheetDto> {

}
