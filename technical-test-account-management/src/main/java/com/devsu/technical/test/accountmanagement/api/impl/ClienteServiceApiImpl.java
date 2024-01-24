package com.devsu.technical.test.accountmanagement.api.impl;

import com.devsu.technical.test.accountmanagement.dto.ClienteDTO;
import com.devsu.technical.test.accountmanagement.entity.Cliente;
import com.devsu.technical.test.accountmanagement.mapper.ClienteMapper;
import com.devsu.technical.test.accountmanagement.api.ClienteServiceApi;
import com.devsu.technical.test.accountmanagement.util.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class ClienteServiceApiImpl implements ClienteServiceApi
{

	private RestTemplate restTemplate;
	private String clientServiceUrl;
	private ClienteMapper clienteMapper;


	@Autowired
	public ClienteServiceApiImpl(RestTemplate restTemplate, @Value("${external.service.url}") String clientServiceUrl, ClienteMapper clienteMapper) {
		this.restTemplate = restTemplate;
		this.clientServiceUrl = clientServiceUrl;
		this.clienteMapper = clienteMapper;
	}

	@Override
	public Cliente getClienteById(Integer clienteId)
	{
		String url = String.format("%s/%s",
				clientServiceUrl, clienteId);
		ResponseEntity<Cliente> response = restTemplate.getForEntity(url, Cliente.class);

		if (!response.getStatusCode().is2xxSuccessful() || response.getBody() == null) {
			log.error("No se pudo encontrar un cliente con el ID: {}", clienteId);
			throw new NotFoundException(String.format("No se pudo encontrar un cliente con el ID: %d", clienteId));
		}
		return response.getBody();
	}



	@Override
	public Cliente getClienteByIdentificacion(String identificacion)
	{
		String url = String.format("%s/identificacion/%s",
				clientServiceUrl, identificacion);
		ResponseEntity<ClienteDTO> response = restTemplate.getForEntity(url, ClienteDTO.class);

		if (!response.getStatusCode().is2xxSuccessful() || response.getBody() == null) {
			log.error("No se pudo encontrar un cliente con la identificación: {}", identificacion);
			throw new NotFoundException(String.format("No se pudo encontrar un cliente con la identificación: %s", identificacion));
		}

		return clienteMapper.clienteDTOToCliente(response.getBody());
	}
}
