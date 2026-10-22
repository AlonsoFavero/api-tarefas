package com.example.apitarefas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.test.web.servlet.MvcResult;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
public class TarefaControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void deveListarTarefa() throws Exception{

        mockMvc.perform(
                get("/tarefas")
        ).andExpect(status().isOk());
    }

    @Test
    void deveCriarTarefa() throws Exception{

        mockMvc.perform(
                post("/tarefas")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"titulo\":\"Estudar Java\",\"descricao\":\"Praticar testes\"}")
        ).andExpect(status().isOk());
    }

    @Test
    void deveBuscarTarefaPorId() throws Exception{

      MvcResult resultado = mockMvc.perform(
                post("/tarefas")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"titulo\":\"Estudar Java\",\"descricao\":\"Praticar testes\"}")
        ).andExpect(status().isOk())
              .andReturn();

        JsonNode json = new ObjectMapper().readTree(resultado.getResponse().getContentAsString());
        int id = json.get("id").asInt();

        mockMvc.perform(
                get("/tarefas/" + id)
        ).andExpect(status().isOk());
    }

    @Test
    void deveAtualizarTarefa() throws Exception{

       MvcResult resultado =  mockMvc.perform(
                post("/tarefas")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"titulo\":\"Estudar Java\",\"descricao\":\"Praticar testes\"}")
        ).andExpect(status().isOk())
               .andReturn();

        JsonNode json = new ObjectMapper().readTree(resultado.getResponse().getContentAsString());
        int id = json.get("id").asInt();

        mockMvc.perform(
                put("/tarefas/" + id)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"titulo\":\"Estudar Phyton\",\"descricao\":\"Praticar diariamente\"}")

        ).andExpect(status().isOk());
    }

    @Test
    void deveExcluirTarefa() throws Exception{

      MvcResult resultado =  mockMvc.perform(
                post("/tarefas")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"titulo\":\"Estudar Java\",\"descricao\":\"Praticar testes\"}")
        ).andExpect(status().isOk())
              .andReturn();

        JsonNode json = new ObjectMapper().readTree(resultado.getResponse().getContentAsString());
        int id = json.get("id").asInt();

        mockMvc.perform(
                delete("/tarefas/" + id)
        ).andExpect(status().isOk());

        mockMvc.perform(
                get("/tarefas/" + id)
        ).andExpect(status().isNotFound());
    }

    @Test
    void deveRetornar404QuandoTarefaNaoExiste() throws Exception{

        mockMvc.perform(
                get("/tarefas/999")
        ).andExpect(status().isNotFound());
    }

    @Test
    void deveRetornar404AoExcluirTarefaInexistente() throws Exception{

        mockMvc.perform(
                delete("/tarefas/999")
        ).andExpect(status().isNotFound());
    }
}
