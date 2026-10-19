package com.example.apitarefas.service;

import com.example.apitarefas.model.Tarefa;
import com.example.apitarefas.repository.TarefaRepository;

import java.util.List;
import java.util.Optional;

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

    public Optional<Tarefa> buscarPorId(Integer id){

        return tarefaRepository.findById(id);
    }
}