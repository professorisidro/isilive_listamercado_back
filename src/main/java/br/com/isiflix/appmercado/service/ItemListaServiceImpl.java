package br.com.isiflix.appmercado.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.isiflix.appmercado.model.ItemLista;
import br.com.isiflix.appmercado.repo.ItemListaRepo;

@Component
public class ItemListaServiceImpl implements IItemListaService {

	@Autowired
	private ItemListaRepo repo;
	
	@Override
	public ItemLista inserirItem(ItemLista novo) {
		// TODO Auto-generated method stub
		return repo.save(novo);
	}

	@Override
	public ItemLista alterarItem(ItemLista item) {
		// TODO Auto-generated method stub
		return repo.save(item);
	}

	@Override
	public void removerItem(Integer numSeq) {
		// TODO Auto-generated method stub
		repo.deleteById(numSeq);
	}

}
