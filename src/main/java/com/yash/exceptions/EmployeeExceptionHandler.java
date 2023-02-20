package com.yash.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeExceptionHandler {
	@ExceptionHandler(value = {EmployeeNotFoundException.class}) // here we need to mention all the exceptions are being handled by this exception
	public ResponseEntity<Object> handleEmployeeNotFoundException(
			EmployeeNotFoundException employeeNotFoundException) {
		
		EmployeeException exception = new EmployeeException();
		
		exception.setTimestamp(LocalDateTime.now());
		exception.setMessage(employeeNotFoundException.getMessage()); 
		exception.setThrowable(employeeNotFoundException.getCause()); 
		exception.setStatus(HttpStatus.NOT_FOUND);
		
		
		return new ResponseEntity<>(exception, HttpStatus.NOT_FOUND);

	}
}
