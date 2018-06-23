package com.agroall.gessica.promocoes.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.DataCollectionResourceControllerImpl;
import com.agroall.gessica.promocoes.dataobjects.Promocao;
import com.agroall.gessica.promocoes.services.OrdemVendaService;
import com.agroall.gessica.services.Service;

@RestController
@RequestMapping("/ordensvenda")
public class OrdemVendaCollectionResource extends DataCollectionResourceControllerImpl<Promocao> {
	
	@Autowired private OrdemVendaService service;
	
	@Override
	protected Service<Promocao> getService() {
		return this.service;
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Promocao> doList() {
		return super.doList();
	}
	
}
