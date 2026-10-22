package com.example.apitarefas.controller;

import com.example.apitarefas.model.Tarefa;
import com.example.apitarefas.service.TarefaService;
import jakarta.validation.Valid;
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
    public Tarefa criar(@Valid @RequestBody Tarefa tarefa){

       return tarefaService.salvar(tarefa);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Integer id){

         tarefaService.excluir(id);
    }

    @PutMapping("/{id}")
    public Tarefa atualizar(@PathVariable Integer id, @Valid @RequestBody Tarefa tarefa){

        return tarefaService.atualizar(id, tarefa);
    }
}
