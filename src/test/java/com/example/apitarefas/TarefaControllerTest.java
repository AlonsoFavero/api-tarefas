package com.example.apitarefas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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

        mockMvc.perform(
                post("/tarefas")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"titulo\":\"Estudar Java\",\"descricao\":\"Praticar testes\"}")
        ).andExpect(status().isOk());

        mockMvc.perform(
                get("/tarefas/1")
        ).andExpect(status().isOk());
    }
}
