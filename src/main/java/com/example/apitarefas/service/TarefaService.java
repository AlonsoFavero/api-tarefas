package com.example.apitarefas.service;

import com.example.apitarefas.exception.TarefaNotFoundException;
import com.example.apitarefas.model.Tarefa;
import com.example.apitarefas.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

    public Tarefa buscarPorId(Integer id){

        return tarefaRepository.findById(id).orElseThrow(() -> new TarefaNotFoundException("tarefa não encontrada"));
    }

    public void excluir(Integer id){

        buscarPorId(id);

        tarefaRepository.deleteById(id);
    }

    public Tarefa atualizar(Integer id, Tarefa tarefa){

       Tarefa tarefaAtualizada = buscarPorId(id);

        tarefaAtualizada.setTitulo(tarefa.getTitulo());
        tarefaAtualizada.setDescricao(tarefa.getDescricao());
        tarefaAtualizada.setConcluida(tarefa.isConcluida());

      return tarefaRepository.save(tarefaAtualizada);
    }
}