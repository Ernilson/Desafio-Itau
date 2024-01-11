package br.com.testeItau.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;



@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity newException(Exception excepiton) {
		
		return new ResponseEntity<>("Este campo não deve ficar vasio", HttpStatus.BAD_REQUEST);
	}

}
