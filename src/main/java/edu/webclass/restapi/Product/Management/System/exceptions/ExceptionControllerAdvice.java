package edu.webclass.restapi.Product.Management.System.exceptions;

import edu.webclass.restapi.Product.Management.System.exceptions.exceptiondtos.ExceptionResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDateTime;

@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler({EntityNotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ExceptionResponseDto> entityNotFoundExceptionHandler(EntityNotFoundException exception) {
        return new ResponseEntity<>(new ExceptionResponseDto(LocalDateTime.now(), exception.getMessage()), HttpStatus.NOT_FOUND);
    }

}
