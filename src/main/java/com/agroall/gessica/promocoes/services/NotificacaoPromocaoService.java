package com.agroall.gessica.promocoes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agroall.gessica.promocoes.dataobjects.NotificacaoPromocao;
import com.agroall.gessica.promocoes.repositories.NotificacaoPromocaoRepository;
import com.agroall.gessica.repositories.Repository;
import com.agroall.gessica.services.ServiceImpl;

@Service
public class NotificacaoPromocaoService extends ServiceImpl<NotificacaoPromocao> {
	
	@Autowired private NotificacaoPromocaoRepository repository;
	
	@Override
	public NotificacaoPromocao factoryNewDataObject() {
		return new NotificacaoPromocao();
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
