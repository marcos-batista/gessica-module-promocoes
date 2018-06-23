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
import com.agroall.gessica.promocoes.services.OrdemVendaService;
import com.agroall.gessica.services.Service;

@RestController
@RequestMapping("/ordemvenda")
@CrossOrigin
public class OrdemVendaResource extends DataObjectResourceControllerImpl<Promocao> {
	
	@Autowired private OrdemVendaService service;
	
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
	public Promocao doPost(@RequestBody Promocao ordemVenda) {
		ordemVenda.setId(null);
		return super.doPost(ordemVenda);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Promocao doGet(@PathVariable(value = "id") String id) {
		return super.doGet(id);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public Promocao doPut(@PathVariable(value = "id") String id, Promocao ordemVenda) {
		ordemVenda.setId(id);
		return super.doPut(id, ordemVenda);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public Promocao doDelete(Promocao ordemVenda) {
		return super.doDelete(ordemVenda);
	}
	
}
