package com.devsu.technical.test.service;

import com.devsu.technical.test.dto.ClienteDTO;
import com.devsu.technical.test.entity.Cliente;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface ClienteService
{
	List<ClienteDTO> findAll();

	ClienteDTO findByClienteId(Integer clienteId);


	ClienteDTO create(ClienteDTO clienteDTO);


	ClienteDTO update(ClienteDTO clienteDTO);


	ClienteDTO patch(Integer clienteId, Map<String, Object> updates);


	boolean delete(Integer clienteId);

	Optional<ClienteDTO> findByIdentificacion(final String identificacion);
}
