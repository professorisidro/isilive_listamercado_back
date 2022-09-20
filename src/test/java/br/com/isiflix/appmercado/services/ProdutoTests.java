package br.com.isiflix.appmercado.services;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import br.com.isiflix.appmercado.model.Produto;
import br.com.isiflix.appmercado.service.IProdutoService;
import br.com.isiflix.appmercado.service.ProdutoServiceImpl;

@SpringBootTest
@ActiveProfiles("test")
public class ProdutoTests {

	@Autowired
	private IProdutoService service;
	
//	private static ProdutoServiceImpl service;
	private static Integer idFound = 1;
	private static Integer idNotFound = 100;
	private static Produto newProduct;
	private static Produto createdProduct;
	
	@BeforeAll
	public static void setup() {
		System.out.println("Configurando parametros de testes");
		newProduct = new Produto();
		newProduct.setNome("Bolacha");
		
		createdProduct = new Produto();
		createdProduct.setNome("Bolacha");
		createdProduct.setId(1);
		
		/*service = Mockito.mock(ProdutoServiceImpl.class);
		Mockito.when(service.criarNovoProduto(newProduct)).thenReturn(new Produto());
		Mockito.when(service.buscarPorId(idFound)).thenReturn(createdProduct);
		Mockito.when(service.buscarPorId(idNotFound)).thenReturn(null);
		Mockito.when(service.buscarPorPalavraChave("b")).thenReturn(new ArrayList<Produto>());
		Mockito.when(service.listarTodos()).thenReturn(new ArrayList<Produto>());
		Mockito.when(service.alterarProduto(createdProduct)).thenReturn(createdProduct);*/
	}
	
	@Test
	public void shouldStoreProduct() {		
		assertNotNull(service.criarNovoProduto(newProduct));
	}
}
