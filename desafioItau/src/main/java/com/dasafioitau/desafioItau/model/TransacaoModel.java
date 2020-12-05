package com.dasafioitau.desafioItau.model;

import java.time.OffsetDateTime;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class TransacaoModel {
	
	//Atributos	
	private float valor;
	
	@Temporal(TemporalType.TIMESTAMP)
	private OffsetDateTime dataHora = OffsetDateTime.now();
	
	//Construtores
	public TransacaoModel() {
		super();
	}
	
	public TransacaoModel(float valor, OffsetDateTime dataHora) {
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

	public OffsetDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(OffsetDateTime dataHora) {
		this.dataHora = dataHora;
	}

	
	
}
