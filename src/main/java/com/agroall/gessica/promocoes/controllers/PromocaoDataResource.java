package com.agroall.gessica.promocoes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.DataObjectResourceControllerImpl;
import com.agroall.gessica.promocoes.dataobjects.Promocao;
import com.agroall.gessica.promocoes.services.PromocaoService;
import com.agroall.gessica.services.Service;

@RestController
@RequestMapping("/promocao")
@CrossOrigin
public class PromocaoDataResource extends DataObjectResourceControllerImpl<Promocao> {
	
	@Autowired private PromocaoService service;
	
	@Override
	protected Service<Promocao> getService() {
		return this.service;	
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public Promocao doGet() {
		return super.doGet();
	}
	
	@Override
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public Promocao doPost(@RequestBody Promocao promocao) {
		promocao.setId(null);
		return super.doPost(promocao);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Promocao doGet(@PathVariable(value = "id") String id) {
		return super.doGet(id);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public Promocao doPut(@PathVariable(value = "id") String id, @RequestBody Promocao promocao) {
		promocao.setId(id);
		return super.doPut(id, promocao);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public Promocao doDelete(Promocao promocao) {
		return super.doDelete(promocao);
	}
	
}
