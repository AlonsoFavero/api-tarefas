package com.example.apitarefas.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler{

    @ExceptionHandler(TarefaNotFoundException.class)
    public ResponseEntity<?> tratarTarefaNaoEncontrada (TarefaNotFoundException exception){

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
