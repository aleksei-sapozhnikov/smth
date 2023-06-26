package com.github.vermucht.smth;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloWorldController.class)
class HelloWorldControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    void GetHelloWorld() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello, World"));

        mockMvc.perform(MockMvcRequestBuilders.get("/hello")
                        .param("name", "AAA"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello, AAA"));
    }
}