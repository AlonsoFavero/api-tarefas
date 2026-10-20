package com.example.apitarefas.controller;

import com.example.apitarefas.model.Tarefa;
import com.example.apitarefas.service.TarefaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService){
        this.tarefaService = tarefaService;
    }

    @GetMapping
    public List<Tarefa> listar(){

      return  tarefaService.listar();
    }

    @GetMapping("/{id}")
    public Tarefa buscarPorId(@PathVariable Integer id){

        return tarefaService.buscarPorId(id);
    }

    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa){

       return tarefaService.salvar(tarefa);
    }
}
