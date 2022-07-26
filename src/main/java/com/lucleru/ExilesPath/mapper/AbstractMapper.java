package com.lucleru.ExilesPath.mapper;

public interface AbstractMapper<E, D> {
	D entityToDto (E entitiy);
	E dtoToEntity (D dto);
	
}
