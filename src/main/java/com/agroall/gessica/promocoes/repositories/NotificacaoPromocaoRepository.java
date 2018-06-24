package com.agroall.gessica.promocoes.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agroall.gessica.promocoes.dataobjects.NotificacaoPromocao;
import com.agroall.gessica.repositories.Repository;

public interface NotificacaoPromocaoRepository extends MongoRepository<NotificacaoPromocao, String>, Repository {
	
}
