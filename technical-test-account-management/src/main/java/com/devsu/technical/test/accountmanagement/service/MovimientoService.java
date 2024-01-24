package com.devsu.technical.test.accountmanagement.service;

import com.devsu.technical.test.accountmanagement.dto.MovimientoDTO;

import java.util.List;

public interface MovimientoService
{
	List<MovimientoDTO> findAll();

	MovimientoDTO findById(final Integer id);

	MovimientoDTO create(final MovimientoDTO movimientoDTO);

	MovimientoDTO update(final MovimientoDTO movimientoDTO);

	void delete(final Integer id);
}
