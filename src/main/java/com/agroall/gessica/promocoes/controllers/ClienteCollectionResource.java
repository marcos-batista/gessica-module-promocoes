package com.agroall.gessica.promocoes.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.DataCollectionResourceControllerImpl;
import com.agroall.gessica.promocoes.dataobjects.Cliente;
import com.agroall.gessica.promocoes.services.ClienteService;
import com.agroall.gessica.services.Service;

@RestController
@RequestMapping("/clientes")
public class ClienteCollectionResource extends DataCollectionResourceControllerImpl<Cliente> {
	
	@Autowired private ClienteService service;
	
	@Override
	protected Service<Cliente> getService() {
		return this.service;
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Cliente> doList() {
		return super.doList();
	}
	
}
