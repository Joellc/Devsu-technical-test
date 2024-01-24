package com.devsu.technical.test.accountmanagement.service;

import com.devsu.technical.test.accountmanagement.dto.ReporteDTO;

import java.time.LocalDate;

public interface ReporteService
{
	ReporteDTO getReporte(Integer clienteId, LocalDate fechaInicial, LocalDate fechafinal);
}
