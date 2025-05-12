package com.desafioItau.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GloblaExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<String> parametrosNaoValidos(){
		return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(null);
	}
	
	@ExceptionHandler(TransacaoFuturaException.class)
	public ResponseEntity<String> TransacaoFutura(){
		return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(null);
	}
	
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ResponseEntity<String> ErrorsDiversos(){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
	}
	

}
