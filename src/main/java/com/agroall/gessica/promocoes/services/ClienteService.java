package com.agroall.gessica.promocoes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agroall.gessica.promocoes.dataobjects.Cliente;
import com.agroall.gessica.promocoes.repositories.ClienteRepository;
import com.agroall.gessica.repositories.Repository;
import com.agroall.gessica.services.ServiceImpl;

@Service
public class ClienteService extends ServiceImpl<Cliente> {
	
	@Autowired private ClienteRepository repository;
	
	@Override
	public Cliente factoryNewDataObject() {
		return new Cliente();
	}
	
	@Override
	protected Repository getRepository() {
		return this.repository;
	}
	
	@Override
	protected Repository factoryRepository() {
		return this.repository;
	}
	
}
