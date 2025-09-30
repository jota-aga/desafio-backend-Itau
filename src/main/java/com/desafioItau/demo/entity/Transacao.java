package com.desafioItau.demo.entity;

import java.time.OffsetDateTime;


public class Transacao {
	private Double valor;
	private OffsetDateTime dataHora;
	
	public Transacao(Double valor, OffsetDateTime dataHora) {
		this.valor = valor;
		this.dataHora = dataHora;
	}
	
	
	
	public Transacao() {
		super();
	}



	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public OffsetDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(OffsetDateTime dataHora) {
		this.dataHora = dataHora;
	}
	@Override
	public String toString() {
		return String.format("Transacao [valor=%s, dataHora=%s]", valor, dataHora);
	}
	
	
	
	
}
