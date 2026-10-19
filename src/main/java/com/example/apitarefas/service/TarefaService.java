package com.example.apitarefas.service;

import com.example.apitarefas.repository.TarefaRepository;

public class TarefaService {

    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }
}