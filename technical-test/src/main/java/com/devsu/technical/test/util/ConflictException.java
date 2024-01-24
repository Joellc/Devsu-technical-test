package com.devsu.technical.test.util;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class ConflictException extends RuntimeException
{
	public ConflictException(String message)
	{
		super(message);
	}

}
