package com.desafioItau.demo.entity;

import java.time.OffsetDateTime;


public class Transacao {
	private double valor;
	private OffsetDateTime dataHora;
	
	public Transacao(double valor, OffsetDateTime dataHora) {
		this.valor = valor;
		this.dataHora = dataHora;
	}
	
	
	
	public Transacao() {
		super();
	}



	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
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
