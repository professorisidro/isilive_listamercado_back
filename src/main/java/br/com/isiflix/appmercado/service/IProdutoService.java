package br.com.isiflix.appmercado.service;

import java.util.List;

import br.com.isiflix.appmercado.model.Produto;

public interface IProdutoService {
	public Produto criarNovoProduto(Produto prod);
	public List<Produto> listarTodos();
	public List<Produto> buscarPorPalavraChave(String key);
	public Produto buscarPorId(Integer id);
}
