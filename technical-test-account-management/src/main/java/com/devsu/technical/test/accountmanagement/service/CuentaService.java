package com.devsu.technical.test.accountmanagement.service;

import com.devsu.technical.test.accountmanagement.dto.CuentaDTO;
import com.devsu.technical.test.accountmanagement.entity.Cliente;
import com.devsu.technical.test.accountmanagement.entity.Cuenta;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface CuentaService
{
	List<CuentaDTO> findAll();

	CuentaDTO findById(final Integer id);

	CuentaDTO create(final CuentaDTO cuentaDTO);

	CuentaDTO update(final CuentaDTO cuentaDTO);

	CuentaDTO updatePatch(final Integer id, final Map<String, Object> results);

	void delete(final Integer id);

	Optional<Cuenta> findByNumeroCuenta(final String numeroCuenta);

	List<Cuenta> findAllByCliente(Cliente cliente);
}
