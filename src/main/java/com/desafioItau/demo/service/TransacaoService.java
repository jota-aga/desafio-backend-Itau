package com.desafioItau.demo.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.desafioItau.demo.entity.Transacao;

@Service
public class TransacaoService {
	private ArrayList<Transacao> transacoes;
	
	public TransacaoService() {
		this.transacoes = new ArrayList<>();
	}
	
	
	public void addTransacao(Transacao transacao) {
		this.transacoes.add(transacao);
	}
	
	public ArrayList<Transacao> getTransacoes(){
		return this.transacoes;
	}

	public void deleteTransacoes() {
		transacoes.clear();
	}
	
	
}
