package com.dasafioitau.desafioItau.model;

import java.time.OffsetDateTime;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sun.istack.NotNull;

public class TransacaoModel {
	
	//Atributos
	@NotNull
	private double valor;
	
	@Temporal(TemporalType.TIMESTAMP)
	private OffsetDateTime dataHora = OffsetDateTime.now();
	
	//Construtores
	public TransacaoModel() {
		super();
	}
	
	public TransacaoModel(double valor, OffsetDateTime dataHora) {
		super();
		this.dataHora = dataHora;
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public OffsetDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(OffsetDateTime dataHora) {
		this.dataHora = dataHora;
	}

	
	
}
