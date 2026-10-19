package com.example.apitarefas.repository;

import com.example.apitarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa,Integer>{
}
