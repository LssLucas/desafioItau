package com.dasafioitau.desafioItau.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dasafioitau.desafioItau.repository.TransacaoRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/transacao")
public class Estatisticas {
	
	@Autowired
	private TransacaoRepository trepository;
	
	@GetMapping
	public ResponseEntity<List<TransacaoRepository>> GetAll(){
		return ResponseEntity.ok(trepository.findAll());
	}
	
}
