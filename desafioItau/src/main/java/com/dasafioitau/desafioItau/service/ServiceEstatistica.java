package com.dasafioitau.desafioItau.service;

import java.util.List;

import com.dasafioitau.desafioItau.model.EstatisticaModel;

public interface ServiceEstatistica {

	/*static void getAll() {
		Tá funcionando sem esse metodo
	}*/
	
	List<EstatisticaModel> getAll();

	EstatisticaModel insert(EstatisticaModel estatistica);
	
}
