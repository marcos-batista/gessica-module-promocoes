package com.agroall.gessica.promocoes.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.DataCollectionResourceControllerImpl;
import com.agroall.gessica.promocoes.dataobjects.NotificacaoPromocao;
import com.agroall.gessica.promocoes.services.NotificacaoPromocaoService;
import com.agroall.gessica.services.Service;

@RestController
@RequestMapping("/notificacoes")
public class NotificacaoPromocaoCollectionResource extends DataCollectionResourceControllerImpl<NotificacaoPromocao> {
	
	@Autowired private NotificacaoPromocaoService service;
	
	@Override
	protected Service<NotificacaoPromocao> getService() {
		return this.service;
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public Collection<NotificacaoPromocao> doList() {
		return super.doList();
	}
	
}
