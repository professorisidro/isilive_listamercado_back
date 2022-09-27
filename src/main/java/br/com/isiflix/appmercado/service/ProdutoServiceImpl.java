package br.com.isiflix.appmercado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.isiflix.appmercado.model.Produto;
import br.com.isiflix.appmercado.repo.ProdutoRepo;

@Component
public class ProdutoServiceImpl implements IProdutoService{
	
	@Autowired
	private ProdutoRepo repo;

	@Override
	public Produto criarNovoProduto(Produto prod) {
		// TODO Auto-generated method stub
		if (prod.getNome() == null || prod.getNome().length() == 0)
			return null;
		return repo.save(prod);
	}

	@Override
	public List<Produto> listarTodos() {
		// TODO Auto-generated method stub
		return (List<Produto>)repo.findAll();
	}

	@Override
	public List<Produto> buscarPorPalavraChave(String key) {
		// TODO Auto-generated method stub
		return repo.findAllByNomeContaining(key);
	}

	@Override
	public Produto buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

}
