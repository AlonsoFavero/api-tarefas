package com.example.apitarefas.exception;

public class TarefaNotFoundException extends RuntimeException{

   public TarefaNotFoundException(String mensagem){
       super(mensagem);
   }
}
