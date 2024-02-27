package com.briz.CrudExceptionHandling;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(ProductNotfoundException.class)
	 @ResponseStatus(HttpStatus.BAD_REQUEST)
	

}
