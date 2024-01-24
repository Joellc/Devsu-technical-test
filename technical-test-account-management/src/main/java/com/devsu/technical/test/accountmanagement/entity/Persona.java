package com.devsu.technical.test.accountmanagement.entity;

import com.devsu.technical.test.accountmanagement.enums.GeneroType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Persona
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cliente_id")
	private Integer clienteId;

	@NotEmpty(message = "El campo nombre es obligatorio por favor introduzca")
	private String nombre;

	@NotEmpty(message = "El campo genero es obligatorio escoja entre MASCULINO, FEMENINO o NO_DEFINE ")
	@Enumerated(EnumType.STRING)
	private GeneroType genero;

	@Min(18)
	@Max(100)
	private byte edad;

	@NotEmpty(message = "El campo identificacion es obligatorio por favor introduzca")
	@Column(unique = true)
	@Pattern(regexp = "^[0-9]{10,13}$",
			message = "Numero de identificación incorrecto, la identificación debe contener entre 10 y 13 digitos")
	private String identificacion;

	@NotEmpty(message = "El campo dirección es obligatorio, por favor intorduzca")
	private String direccion;

	@NotEmpty(message = "El campo telefono es obligatorio, por favor intorduzca")
	@Pattern(regexp = "^[0-9]{9,13}$",
			message = "Numero de telefono incorrecto, el telefono debe contener entre 9 y 13 digitos")
	private String telefono;
}
