package edu.webclass.restapi.Product.Management.System.exceptions.exceptiondtos;

import java.time.LocalDateTime;

public class ExceptionResponseDto {
    private LocalDateTime timestamp;
    private String message;

    public ExceptionResponseDto(LocalDateTime timestamp, String message) {
        this.timestamp = timestamp;
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }
}
