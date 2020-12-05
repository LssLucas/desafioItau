package com.dasafioitau.desafioItau.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dasafioitau.desafioItau.model.EstatisticaModel;
import com.dasafioitau.desafioItau.service.ServiceEstatistica;
import com.dasafioitau.desafioItau.service.impl.ServiceEstatisticaImpl;


@CrossOrigin("*")
@RestController
public class EstatisticaController {

	ServiceEstatistica serviceEstatistica = new ServiceEstatisticaImpl();
	
	@GetMapping("/estatistica")
	public List<EstatisticaModel> getAll(){
		return serviceEstatistica.getAll();
	}
	
}
