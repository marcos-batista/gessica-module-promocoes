package com.agroall.gessica.promocoes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agroall.gessica.promocoes.dataobjects.Promocao;
import com.agroall.gessica.promocoes.repositories.OrdemVendaRepository;
import com.agroall.gessica.repositories.Repository;
import com.agroall.gessica.services.ServiceImpl;

@Service
public class OrdemVendaService extends ServiceImpl<Promocao> {
	
	@Autowired private OrdemVendaRepository repository;
	
	@Override
	public Promocao factoryNewDataObject() {
		return new Promocao();
	}
	
	@Override
	protected Repository getRepository() {
		return this.repository;
	}
	
	@Override
	protected Repository factoryRepository() {
		return this.repository;
	}
	
	@Override
	protected void validateBeforeInsertOrUpdate(Promocao ordemVenda) {
		validateOrdemVendaBeforeSave(ordemVenda);
	}
	
	protected void validateOrdemVendaBeforeSave(Promocao ordemVenda) {
		if(ordemVenda == null) throw new RuntimeException("A ordem de venda não foi informada");
//		if(ordemVenda.getItens() == null || ordemVenda.getItens().isEmpty()) throw new RuntimeException("Os itens da ordem de venda não foram informados");
//		Collection<ItemOrdemVenda> itensOrdemVenda = ordemVenda.getItens();
//		for (ItemOrdemVenda itemOrdemVenda : itensOrdemVenda) {
//			if(itemOrdemVenda.getProdutoComercial() == null) throw new RuntimeException("Há pelo menos um item da ordem de venda cujo produto não foi informado");
//			if(itemOrdemVenda.getProdutoComercial().getId() == null) throw new RuntimeException("Há pelo menos um item da ordem de venda cujo produto é inválido");
//		}
	}
	
}
