package com.desafioItau.demo.report;

import java.time.OffsetDateTime;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import com.desafioItau.demo.entity.Transacao;

public class Estatistica {
	
	private List<Transacao> transacoesRecentes;
	private DoubleSummaryStatistics estatisticas;

	public Estatistica(List<Transacao> transacoes) {
		this.transacoesRecentes = this.filtroTransacoes(transacoes);
		this.estatisticas = this.transacoesRecentes.stream()
			     				.collect(Collectors.summarizingDouble(Transacao::getValor));
	}



	private List<Transacao> filtroTransacoes(List<Transacao> transacoes){
		OffsetDateTime ultimos60Seg = OffsetDateTime.now().minusMinutes(1);
		List<Transacao> recentes = transacoes.stream()
		        .filter(transacao -> !transacao.getDataHora().isBefore(ultimos60Seg))
		        .toList();
		
		return recentes;
	}
	
	public DoubleSummaryStatistics getEstatisticas() {
		return this.estatisticas;
	}
}
	
