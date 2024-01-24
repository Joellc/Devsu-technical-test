package com.devsu.technical.test.accountmanagement.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "clientes")
public class Cliente extends Persona
{
	@NotEmpty(message = "El campo contraseña es obligatorio por favor introduzca")
	private String contrasena;

	@NotNull(message = "El campo estado es obligatorio por favor introduzca")
	private Boolean estado;

	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Cuenta> cuentas;
}
