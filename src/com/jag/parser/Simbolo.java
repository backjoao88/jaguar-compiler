package com.jag.parser;

public abstract class Simbolo {

	private String nome = null;

	public Simbolo(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
