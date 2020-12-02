package com.dasafioitau.desafioItau.model;

import java.util.Date;

import javax.validation.constraints.Size;


public class Transacao {

	@Size(min=0)
	private  float valor;

	private Date data = new java.sql.Date(System.currentTimeMillis());
	
	public Transacao() {
		
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
		
	
}
