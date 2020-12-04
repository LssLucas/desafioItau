package com.dasafioitau.desafioItau.model;

import java.util.Date;

public class TransacaoModel {
	
	//Atributos
	
	private float valor;
	
	private Date dataHora;
	
	//Construtores
	public TransacaoModel() {
		super();
	}
	
	public TransacaoModel(float valor, Date dataHora) {
		super();
		this.dataHora = dataHora;
		this.valor = valor;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	
	
	
}
