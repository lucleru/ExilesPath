package com.lucleru.ExilesPath.mapper;

import org.mapstruct.Mapper;

import com.lucleru.ExilesPath.domain.Attributes;
import com.lucleru.ExilesPath.dto.AttributesDto;

@Mapper
public interface AttributesMapper extends AbstractMapper<Attributes, AttributesDto> {

}
