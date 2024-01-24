package com.devsu.technical.test.accountmanagement.repository;

import com.devsu.technical.test.accountmanagement.entity.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoRepository extends JpaRepository<Movimiento, Integer>
{
}
