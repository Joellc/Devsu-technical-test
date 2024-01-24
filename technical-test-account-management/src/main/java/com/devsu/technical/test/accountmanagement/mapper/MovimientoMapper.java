package com.devsu.technical.test.accountmanagement.mapper;

import com.devsu.technical.test.accountmanagement.dto.MovimientoDTO;
import com.devsu.technical.test.accountmanagement.entity.Movimiento;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface MovimientoMapper
{
	MovimientoDTO movimientoToMoviemientoDTO(final Movimiento movimiento);
	Movimiento movimientoDTOToMovimiento(final MovimientoDTO movimientoDTO);
}
