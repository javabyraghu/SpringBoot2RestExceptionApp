package in.nareshit.raghu.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import in.nareshit.raghu.exception.EmployeeNotFoundException;
import in.nareshit.raghu.model.ErrorType;

@ControllerAdvice
public class MyExceptionHandler {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<ErrorType> showError(RuntimeException e) 
	{
		return new ResponseEntity<>(
				new ErrorType(e.getMessage(), "EMPLOYEE SERVICE"),
				HttpStatus.NOT_FOUND);
	}
}
