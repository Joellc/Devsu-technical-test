package com.devsu.technical.test.accountmanagement.repository;

import com.devsu.technical.test.accountmanagement.entity.Cliente;
import com.devsu.technical.test.accountmanagement.entity.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CuentaRepository extends JpaRepository<Cuenta, Integer>
{
	Optional<Cuenta> findByNumeroCuenta(final String numeroCuenta);

	List<Cuenta> findAllByCliente(Cliente cliente);
}
