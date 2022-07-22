package com.lucleru.exilespath.mapper;

import org.mapstruct.Mapper;

import com.lucleru.exilespath.domain.CharacterSheet;
import com.lucleru.exilespath.dto.CharacterSheetDto;

@Mapper
public interface CharacterSheetMapper extends AbstractMapper<CharacterSheet, CharacterSheetDto> {

}
