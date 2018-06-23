package com.agroall.gessica.promocoes.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agroall.gessica.promocoes.dataobjects.ProdutoComercial;
import com.agroall.gessica.repositories.Repository;

public interface ProdutoComercialRepository extends MongoRepository<ProdutoComercial, String>, Repository {
	
}
