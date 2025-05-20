package com.desafioItau.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.desafioItau.demo.dto.TransacaoRequest;
import com.desafioItau.demo.entity.Transacao;
import com.desafioItau.demo.repository.TransacaoRepository;

import jakarta.validation.Valid;

@RestController
public class TransacaoController {
	
	@Autowired
	private TransacaoRepository repo;
	
	@PostMapping("/transacao")
	public ResponseEntity<String> createTransacao(@Valid @RequestBody TransacaoRequest transacaoDto) {		
		Transacao transacao = new Transacao();
		transacao.setDataHora(transacaoDto.getDataHora());
		transacao.setValor(transacaoDto.getValor());
		
		repo.addTransacao(transacao);
		return ResponseEntity.status(HttpStatus.OK).body(null);
	}
	
	@DeleteMapping("/transacao")
	public ResponseEntity<String> deleteAllTransacoes(){
		repo.deleteTransacoes();
		return ResponseEntity.status(HttpStatus.OK).body(null);
	}
	
}
