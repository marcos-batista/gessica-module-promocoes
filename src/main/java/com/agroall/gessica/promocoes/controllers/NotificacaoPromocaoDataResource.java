package com.agroall.gessica.promocoes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.DataObjectResourceControllerImpl;
import com.agroall.gessica.promocoes.dataobjects.NotificacaoPromocao;
import com.agroall.gessica.promocoes.services.NotificacaoPromocaoService;
import com.agroall.gessica.services.Service;

@RestController
@RequestMapping("/notificacao")
@CrossOrigin
public class NotificacaoPromocaoDataResource extends DataObjectResourceControllerImpl<NotificacaoPromocao> {
	
	@Autowired private NotificacaoPromocaoService service;
	
	@Override
	protected Service<NotificacaoPromocao> getService() {
		return this.service;	
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public NotificacaoPromocao doGet() {
		return super.doGet();
	}
	
	@Override
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public NotificacaoPromocao doPost(@RequestBody NotificacaoPromocao notificacaoPromocao) {
		notificacaoPromocao.setId(null);
		return super.doPost(notificacaoPromocao);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public NotificacaoPromocao doGet(@PathVariable(value = "id") String id) {
		return super.doGet(id);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public NotificacaoPromocao doPut(@PathVariable(value = "id") String id, @RequestBody NotificacaoPromocao notificacaoPromocao) {
		notificacaoPromocao.setId(id);
		return super.doPut(id, notificacaoPromocao);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public NotificacaoPromocao doDelete(NotificacaoPromocao notificacaoPromocao) {
		return super.doDelete(notificacaoPromocao);
	}
	
}
