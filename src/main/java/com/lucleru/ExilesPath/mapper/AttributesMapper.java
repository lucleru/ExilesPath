package com.lucleru.exilespath.mapper;

import org.mapstruct.Mapper;

import com.lucleru.exilespath.domain.Attributes;
import com.lucleru.exilespath.dto.AttributesDto;

@Mapper
public interface AttributesMapper extends AbstractMapper<Attributes, AttributesDto> {

}
