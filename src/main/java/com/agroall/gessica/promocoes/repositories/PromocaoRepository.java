package com.agroall.gessica.promocoes.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agroall.gessica.promocoes.dataobjects.Promocao;
import com.agroall.gessica.repositories.Repository;

public interface PromocaoRepository extends MongoRepository<Promocao, String>, Repository {
	
}
