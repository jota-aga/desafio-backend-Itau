package com.desafioItau.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.desafioItau.demo.dto.TransacaoRequest;
import com.desafioItau.demo.entity.Transacao;
import com.desafioItau.demo.service.TransacaoService;

import jakarta.validation.Valid;

@RequestMapping("/transacao")
@RestController
public class TransacaoController {
	
	@Autowired
	private TransacaoService transacaoService;
	
	@PostMapping()
	public ResponseEntity<String> createTransacao(@Valid @RequestBody TransacaoRequest transacaoDto) {		
		Transacao transacao = new Transacao();
		transacao.setDataHora(transacaoDto.getDataHora());
		transacao.setValor(transacaoDto.getValor());
		
		transacaoService.addTransacao(transacao);
		return ResponseEntity.status(HttpStatus.CREATED).body(null);
	}
	
	@DeleteMapping()
	public ResponseEntity<String> deleteAllTransacoes(){
		transacaoService.deleteTransacoes();
		return ResponseEntity.status(HttpStatus.OK).body(null);
	}
	
	@GetMapping()
	public ResponseEntity<List<Transacao>> getAllTransacoes(){
		List<Transacao> transacoes = transacaoService.getTransacoes();
		return ResponseEntity.status(HttpStatus.OK).body(transacoes);
	}
}
