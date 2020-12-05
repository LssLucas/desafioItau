package com.dasafioitau.desafioItau.service;

import com.dasafioitau.desafioItau.model.*;

public interface ServiceTransacao {

	TransacaoModel addTransacao(TransacaoModel transacao);
	
	static void deleteAll() {		
	}
	
}
