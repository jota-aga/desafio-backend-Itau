package com.desafioItau.demo.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.desafioItau.demo.entity.Transacao;

@Service
public class TransacaoRepository {
	
	private ArrayList<Transacao> transacoes;
	
	public TransacaoRepository() {
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
