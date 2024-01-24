package com.devsu.technical.test.accountmanagement.mapper;

import com.devsu.technical.test.accountmanagement.dto.CuentaDTO;
import com.devsu.technical.test.accountmanagement.entity.Cuenta;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CuentaMapper
{
	CuentaDTO cuentaToCuentaDTO(final Cuenta cuenta);
	Cuenta cuentaDTOToCuenta(final CuentaDTO cuentaDTO);
}
