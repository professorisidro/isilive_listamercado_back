package br.com.isiflix.appmercado.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class ProdutoAPITests {
	@Autowired
	private MockMvc mvc;
	
	@Test
	public void deveriaRetornarProdutoPorId() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/produtos/1"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andDo(MockMvcResultHandlers.print());
	}
	
	@Test
	public void deveriaNaoEncontrarProduto() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/produtos/100"))
			.andExpect(MockMvcResultMatchers.status().isNotFound())
			.andReturn();
	}

}
