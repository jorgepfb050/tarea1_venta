package com.mitocode.exception;
import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController

public class ResponsiveExceptionHandler extends ResponseEntityExceptionHandler {	
	

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionResponsive> manejarTodasException(Exception ex, WebRequest request ){		
		ExceptionResponsive exceptionResponse =new ExceptionResponsive(new Date(),ex.getMessage(),request.getDescription(false));
		return new ResponseEntity<ExceptionResponsive>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	

	
}
