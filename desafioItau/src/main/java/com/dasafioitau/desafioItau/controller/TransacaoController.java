package com.dasafioitau.desafioItau.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dasafioitau.desafioItau.model.TransacaoModel;
import com.dasafioitau.desafioItau.service.ServiceTransacao;

@CrossOrigin("*")
@RestController
public class TransacaoController {

	@PostMapping("/transacao")
	public ResponseEntity<TransacaoModel> addTransacao(@RequestBody TransacaoModel transacao){
			return ResponseEntity.ok(transacao);
	}
	
	@DeleteMapping
	public void deleteAll() {
		ServiceTransacao.deleteAll();
	}
	
}
