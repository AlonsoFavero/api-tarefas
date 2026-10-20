package com.example.apitarefas.controller;

import com.example.apitarefas.service.TarefaService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TarefaController {

    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService){
        this.tarefaService = tarefaService;
    }
}
