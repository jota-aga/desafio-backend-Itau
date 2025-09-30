package com.desafioItau.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafioItau.demo.dto.EstatisticaResponse;
import com.desafioItau.demo.entity.Transacao;
import com.desafioItau.demo.report.Estatistica;
import com.desafioItau.demo.service.TransacaoService;

@RestController
public class EstatisticaController {
	
	@Autowired
	private TransacaoService transacaoService;

	@GetMapping("/estatistica")
	public ResponseEntity<EstatisticaResponse> showEstatisticas(){
		List<Transacao> transacoes = transacaoService.getTransacoes();
		Estatistica estatisticas = new Estatistica(transacoes);
		EstatisticaResponse estatisticaResponse = new EstatisticaResponse(estatisticas.getEstatisticas());

		return  ResponseEntity.status(HttpStatus.OK).body(estatisticaResponse);
	}
}
