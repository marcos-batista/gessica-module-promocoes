package com.agroall.gessica.promocoes.repositories;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.agroall.gessica.repositories.Repository;

public class NotificacaoPromocaoRepositoryImpl implements Repository {
	
	@Autowired private MongoTemplate mongo;
	
	@Override
	public <NotificacaoPromocao> NotificacaoPromocao insert_(NotificacaoPromocao notificacaoPromocao) {
		mongo.insert(notificacaoPromocao);
		return notificacaoPromocao;
	}
	
	@Override
	public <NotificacaoPromocao> NotificacaoPromocao update_(NotificacaoPromocao notificacaoPromocao) {
		mongo.save(notificacaoPromocao);
		return notificacaoPromocao;
	}
	
	@Override
	public <NotificacaoPromocao> void delete_(NotificacaoPromocao notificacaoPromocao) {
		mongo.remove(notificacaoPromocao);
	}

	@Override
	@SuppressWarnings("unchecked")
	public <NotificacaoPromocao> NotificacaoPromocao findById_(Object id) {
		com.agroall.gessica.promocoes.dataobjects.NotificacaoPromocao result = mongo.findById(id, com.agroall.gessica.promocoes.dataobjects.NotificacaoPromocao.class);
		return (NotificacaoPromocao) result;
	}

	@Override
	@SuppressWarnings("unchecked")
	public <NotificacaoPromocao> Collection<NotificacaoPromocao> listAll_() {
		List<com.agroall.gessica.promocoes.dataobjects.NotificacaoPromocao> result = mongo.findAll(com.agroall.gessica.promocoes.dataobjects.NotificacaoPromocao.class);
		return (Collection<NotificacaoPromocao>) result;
	}

}
