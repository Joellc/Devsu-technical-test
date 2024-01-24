package com.devsu.technical.test.repository;

import com.devsu.technical.test.dto.ClienteDTO;
import com.devsu.technical.test.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>
{
	Optional<Cliente> findByIdentificacion(final String identificacion);
	Optional<Cliente> findByClienteId(final Integer clienteId);
	void deleteByClienteId(final Integer clienteId);
}
