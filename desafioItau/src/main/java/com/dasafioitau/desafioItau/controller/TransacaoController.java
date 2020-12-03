package com.dasafioitau.desafioItau.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dasafioitau.desafioItau.model.TransacaoModel;
import com.dasafioitau.desafioItau.repository.TransacaoRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/transacao")
public class TransacaoController {

	@Autowired
	private TransacaoRepository repository;

	@PostMapping
	public ResponseEntity<TransacaoModel> post(@RequestBody TransacaoModel transacao){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(transacao));
	}
	
	@DeleteMapping
	public void delete(@PathVariable int id) {
		repository.deleteAll();
	}

}