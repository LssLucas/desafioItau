package com.dasafioitau.desafioItau.controller;

import java.util.DoubleSummaryStatistics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dasafioitau.desafioItau.service.TransacaoService;

@CrossOrigin("*")
@RequestMapping("/estatistica")
@RestController
public class EstatisticaController {

	@Autowired
	private TransacaoService transacaoS;

	@GetMapping
	public ResponseEntity<DoubleSummaryStatistics> getEstatistica() {
		return ResponseEntity.status(HttpStatus.OK).body(transacaoS.getEstatistica());
	}

}
