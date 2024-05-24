package com.java.training1.exception;

import com.java.training1.dto.ResponseDto;
import org.springframework.http.HttpStatus;

public class ConversionException extends RuntimeException{

    public ConversionException(String message){
        super(message);
    }
}
