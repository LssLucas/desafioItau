package com.dasafioitau.desafioItau.service;

import java.util.List;

import com.dasafioitau.desafioItau.model.*;

public interface ServiceTransacao {

	TransacaoModel addTransacao(TransacaoModel transacao);
	
	static void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	
	List<EstatisticaModel> getAll();
	
}
