package com.agroall.gessica.promocoes.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agroall.gessica.promocoes.dataobjects.Cliente;
import com.agroall.gessica.repositories.Repository;

public interface ClienteRepository extends MongoRepository<Cliente, String>, Repository {
	
}
