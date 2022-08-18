package com.barclays.Customer_Car_Details.Exception;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.barclays.Customer_Car_Details.error.errormsg;

/**
 * ExceptionHandleProg - Automatically catch and handle exception
 
 *
 */
@RestControllerAdvice
public class ExceptionHandleProg {
	
	/**
	 * exceptionHandler - Catch any uncaught exceptions
	 * @param exception
	 * @return errormsg response 
	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<errormsg> exceptionHandler(Exception exception) {
		errormsg error = new errormsg();
		error.setErrorMessage("Denied");
		error.setErrorCode(HttpStatus.ACCEPTED.value());
		error.setTimestamp(LocalDateTime.now());
		return new ResponseEntity<errormsg>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	/**
	 * ExceptionHandler - Catch exception
	 * @param exception
	 * @return errormsg response
	 */
	@ExceptionHandler(Exc.class)
	public ResponseEntity<errormsg> ExceptionHandler(Exc exception) {
		errormsg error = new errormsg();
		error.setErrorMessage(exception.getMessage());
		error.setTimestamp(LocalDateTime.now());
		error.setErrorCode(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<errormsg>(error, HttpStatus.NOT_FOUND);
	}

}