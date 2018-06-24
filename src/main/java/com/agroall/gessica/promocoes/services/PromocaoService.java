package com.agroall.gessica.promocoes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agroall.gessica.promocoes.dataobjects.Promocao;
import com.agroall.gessica.promocoes.repositories.PromocaoRepository;
import com.agroall.gessica.repositories.Repository;
import com.agroall.gessica.services.ServiceImpl;

@Service
public class PromocaoService extends ServiceImpl<Promocao> {
	
	@Autowired private PromocaoRepository repository;
	
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
	
}
