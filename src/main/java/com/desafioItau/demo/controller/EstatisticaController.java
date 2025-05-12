package com.desafioItau.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafioItau.demo.entity.Estatistica;
import com.desafioItau.demo.entity.Transacao;
import com.desafioItau.demo.repository.TransacaoRepository;

@RestController
public class EstatisticaController {
	
	@Autowired
	private TransacaoRepository repo;
	
	
	@GetMapping("/estatistica")
	public Estatistica showEstatisticas(){
		Estatistica estatisticas = new Estatistica();
		List<Transacao> transacoes = repo.getTransacoes();
		estatisticas.calculateEstatitiscas(transacoes);
		return  estatisticas;
	}
}
