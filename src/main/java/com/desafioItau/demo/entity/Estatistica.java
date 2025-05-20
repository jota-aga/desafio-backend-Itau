package com.desafioItau.demo.entity;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Estatistica {
	
	 private  long count;
	 private  double sum;
	 private  double avg;
	 private  double min;
	 private  double max;
	
	 public Estatistica() {
		this.avg = 0;
		this.min = 0;
		this.max = 0;
		this.count = 0;
		this.sum = 0;
		
		
		
	 }
	
	public List<Transacao> filterTransacoes(List<Transacao> transacoes){
		
		List<Transacao> recentes = new ArrayList<>();
		OffsetDateTime last60Seconds = OffsetDateTime.now().minusMinutes(1);
		
		for(Transacao t : transacoes) {
			if(!t.getDataHora().isBefore(last60Seconds)) {
				recentes.add(t);
			}
		}
		return recentes;	
	}
	
	public void calculateEstatitiscas(List<Transacao> transacoes) {
		
		DoubleSummaryStatistics estatisticas = new DoubleSummaryStatistics();
		
		List<Transacao> recentes = filterTransacoes(transacoes);
		
		if(recentes.isEmpty()) {
			return;
		}
		
		for(Transacao t : recentes) {
			estatisticas.accept(t.getValor());
		}
		
		this.avg = estatisticas.getAverage();
		this.sum = estatisticas.getSum();
		this.min = estatisticas.getMin();
		this.max = estatisticas.getMax();
		this.count = estatisticas.getCount();
		
		
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}

	public Double getAvg() {
		return avg;
	}

	public void setAvg(Double avg) {
		this.avg = avg;
	}

	public Double getMin() {
		return min;
	}

	public void setMin(Double min) {
		this.min = min;
	}

	public Double getMax() {
		return max;
	}

	public void setMax(Double max) {
		this.max = max;
	}
	
	
}
