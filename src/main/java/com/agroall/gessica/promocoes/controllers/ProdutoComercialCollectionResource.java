package com.agroall.gessica.promocoes.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.DataCollectionResourceControllerImpl;
import com.agroall.gessica.promocoes.dataobjects.ProdutoComercial;
import com.agroall.gessica.promocoes.services.ProdutoComercialService;
import com.agroall.gessica.services.Service;

@RestController
@RequestMapping("/produtos")
public class ProdutoComercialCollectionResource extends DataCollectionResourceControllerImpl<ProdutoComercial> {
	
	@Autowired private ProdutoComercialService service;
	
	@Override
	protected Service<ProdutoComercial> getService() {
		return this.service;
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public Collection<ProdutoComercial> doList() {
		return super.doList();
	}
	
}
