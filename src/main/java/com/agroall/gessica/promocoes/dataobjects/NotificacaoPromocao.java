package com.agroall.gessica.promocoes.dataobjects;

import com.agroall.gessica.dataobjects.aspects.Persistent;

public class NotificacaoPromocao implements Persistent<String> {
	
	private String id;
	private Long data;
	private String texto;
	
	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}
	
	public Long getData() {
		return data;
	}
	
	public void setData(Long data) {
		this.data = data;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}
