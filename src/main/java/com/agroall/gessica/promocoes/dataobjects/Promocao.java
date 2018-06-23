package com.agroall.gessica.promocoes.dataobjects;

import org.springframework.data.annotation.Id;

import com.agroall.gessica.dataobjects.aspects.Persistent;

public class Promocao implements Persistent<String> {
	
	@Id private String id;
	private Long dataLimite;
	private Double percentualDesconto;
	
	@Override
	public String getId() {
		return this.id;
	}
	
	@Override
	public void setId(String id) {
		this.id = id;
	}
	
	public Long getDataLimite() {
		return dataLimite;
	}
	
	public void setDataLimite(Long dataLimite) {
		this.dataLimite = dataLimite;
	}
	
	public Double getPercentualDesconto() {
		return percentualDesconto;
	}
	
	public void setPercentualDesconto(Double percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}
	
}
