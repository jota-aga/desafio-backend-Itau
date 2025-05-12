package com.desafioItau.demo.dto;

import java.time.OffsetDateTime;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;


public class TransacaoDto {
	@NotNull
	@DecimalMin(value="0.0")
	private double valor;
	
	@NotNull
	private OffsetDateTime dataHora;
	
	
	public TransacaoDto() {
	
	}

	public TransacaoDto(@DecimalMin("0.0") double valor, OffsetDateTime dataHora) {
		super();
		this.valor = valor;
		this.dataHora = dataHora;
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
	
}
