package com.agroall.gessica.promocoes.repositories;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.agroall.gessica.repositories.Repository;

public class OrdemVendaRepositoryImpl implements Repository {
	
	@Autowired private MongoTemplate mongo;
	
	@Override
	public <OrdemVenda> OrdemVenda insert_(OrdemVenda cliente) {
		mongo.insert(cliente);
		return cliente;
	}
	
	@Override
	public <OrdemVenda> OrdemVenda update_(OrdemVenda cliente) {
		mongo.save(cliente);
		return cliente;
	}
	
	@Override
	public <OrdemVenda> void delete_(OrdemVenda cliente) {
		mongo.remove(cliente);
	}

	@Override
	@SuppressWarnings({"unchecked"})
	public <OrdemVenda> OrdemVenda findById_(Object id) {
		com.agroall.gessica.promocoes.dataobjects.Promocao result = mongo.findById(id, com.agroall.gessica.promocoes.dataobjects.Promocao.class);
		return (OrdemVenda) result;
	}

	@Override
	@SuppressWarnings("unchecked")
	public <OrdemVenda> Collection<OrdemVenda> listAll_() {
		List<com.agroall.gessica.promocoes.dataobjects.Promocao> result = mongo.findAll(com.agroall.gessica.promocoes.dataobjects.Promocao.class);
		return (Collection<OrdemVenda>) result;
	}

}
