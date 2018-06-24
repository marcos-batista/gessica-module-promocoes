package com.agroall.gessica.promocoes.repositories;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.agroall.gessica.repositories.Repository;

public class PromocaoRepositoryImpl implements Repository {
	
	@Autowired private MongoTemplate mongo;
	
	@Override
	public <Promocao> Promocao insert_(Promocao promocao) {
		mongo.insert(promocao);
		return promocao;
	}
	
	@Override
	public <Promocao> Promocao update_(Promocao promocao) {
		mongo.save(promocao);
		return promocao;
	}
	
	@Override
	public <Promocao> void delete_(Promocao promocao) {
		mongo.remove(promocao);
	}

	@Override
	@SuppressWarnings("unchecked")
	public <Promocao> Promocao findById_(Object id) {
		com.agroall.gessica.promocoes.dataobjects.Promocao result = mongo.findById(id, com.agroall.gessica.promocoes.dataobjects.Promocao.class);
		return (Promocao) result;
	}

	@Override
	@SuppressWarnings("unchecked")
	public <Promocao> Collection<Promocao> listAll_() {
		List<com.agroall.gessica.promocoes.dataobjects.Promocao> result = mongo.findAll(com.agroall.gessica.promocoes.dataobjects.Promocao.class);
		return (Collection<Promocao>) result;
	}

}
