package com.bonelli.exception;

import com.bonelli.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class CarNotFoundExceptionImpl
{
    @ExceptionHandler
    public ResponseEntity<ResponseDTO> handleMethodArgumentNotValiException(MethodArgumentNotValidException exception)
    {
        List<ObjectError> errList = exception.getBindingResult().getAllErrors();
        List<String> errMsg = errList.stream()
                .map(error-> error.getDefaultMessage())
                .collect(Collectors.toList());
        ResponseDTO responseDTO = new ResponseDTO("Exception occurred",errMsg.toString());

        return new ResponseEntity<>(responseDTO, HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler
    public ResponseEntity<ResponseDTO> handleCarNotFoundException(CarNotFoundException carNotFoundException)
    {
        ResponseDTO responseDTO = new ResponseDTO("Exception while processing the request",carNotFoundException.getMessage());
        return new ResponseEntity<>(responseDTO,HttpStatus.NOT_FOUND);
    }
}
