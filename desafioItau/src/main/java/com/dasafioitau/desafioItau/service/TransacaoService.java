package com.dasafioitau.desafioItau.service;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dasafioitau.desafioItau.model.TransacaoModel;

@Service
public class TransacaoService {

	private List<TransacaoModel> transacao = new ArrayList<>();
	
	public List<TransacaoModel> getTransacoes(){
		return transacao;
	}
	
	public TransacaoModel newTransacao(TransacaoModel t) {
		transacao.add(t);
		int id = transacao.indexOf(t);
		return transacao.get(id);
	}
	
	public List<TransacaoModel> clear(){
		transacao.clear();
		return transacao;
	}
	
	public DoubleSummaryStatistics getEstatistica() {
		DoubleSummaryStatistics x = new DoubleSummaryStatistics(); 
		transacao.stream().filter(repo -> repo.getDataHora().isAfter(OffsetDateTime.now().minusSeconds(60)))
		.forEach(valor -> x.accept(valor.getValor()));
		
		return x;
	}
}
