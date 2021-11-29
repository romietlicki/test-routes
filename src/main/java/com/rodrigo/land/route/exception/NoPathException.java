package com.rodrigo.land.route.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NoPathException extends RuntimeException {

	public NoPathException(final String message) {
		super(message);
	}
}
