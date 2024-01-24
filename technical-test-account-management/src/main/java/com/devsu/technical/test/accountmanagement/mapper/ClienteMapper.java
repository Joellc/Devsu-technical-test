package com.devsu.technical.test.accountmanagement.mapper;

import com.devsu.technical.test.accountmanagement.dto.ClienteDTO;
import com.devsu.technical.test.accountmanagement.entity.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ClienteMapper
{
	Cliente clienteDTOToCliente(final ClienteDTO clienteDTO);
}
