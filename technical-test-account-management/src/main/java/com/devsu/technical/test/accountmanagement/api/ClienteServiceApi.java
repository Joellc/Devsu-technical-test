package com.devsu.technical.test.accountmanagement.api;

import com.devsu.technical.test.accountmanagement.dto.ClienteDTO;
import com.devsu.technical.test.accountmanagement.entity.Cliente;

public interface ClienteServiceApi
{
	Cliente getClienteById(Integer clienteId);
	Cliente getClienteByIdentificacion(String identificacion);
}
