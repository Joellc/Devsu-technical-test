package com.devsu.technical.test.accountmanagement.enums;

public enum MovimientoType
{
	DEBITO("Debito"), CREDITO("Credito");

	private final String value;

	MovimientoType(String value)
	{
		this.value = value;
	}

	public String getValue()
	{
		return value;
	}
}
