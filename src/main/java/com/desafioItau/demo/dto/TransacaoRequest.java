package com.desafioItau.demo.dto;

import java.time.OffsetDateTime;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;


public class TransacaoRequest {
	
	@PositiveOrZero
	private Double valor;
	
	@Past
	private OffsetDateTime dataHora;
	
	
	public TransacaoRequest() {
	
	}

	public TransacaoRequest( Double valor, OffsetDateTime dataHora) {
		super();
		this.valor = valor;
		this.dataHora = dataHora;
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
	
}
