package com.example.apitarefas.service;

import com.example.apitarefas.model.Tarefa;
import com.example.apitarefas.repository.TarefaRepository;

import java.util.List;

public class TarefaService {

    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public Tarefa salvar(Tarefa tarefa){

        return tarefaRepository.save(tarefa);
    }

    public List<Tarefa> listar(){

        return tarefaRepository.findAll();
    }
}