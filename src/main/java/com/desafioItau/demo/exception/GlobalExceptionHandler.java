package com.desafioItau.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<String> FieldsNotValid(){
		return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(null);
	}
	
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ResponseEntity<String> BodyNotReadable(){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
	}
	

}
