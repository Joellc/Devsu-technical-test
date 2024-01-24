package com.devsu.technical.test.mapper;

import com.devsu.technical.test.dto.ClienteDTO;
import com.devsu.technical.test.entity.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper
{
	ClienteDTO clienteToClienteDTO(final Cliente cliente);
	Cliente clienteDTOToCliente(final ClienteDTO clienteDTO);
}
