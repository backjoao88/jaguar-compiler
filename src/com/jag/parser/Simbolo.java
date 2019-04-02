package com.jag.parser;

public class Simbolo {

	private String nome = null;
	private String tipoDado = null;
	private String tipo = null;

	public Simbolo(String nome, String tipoDado, String tipo) {
		super();
		this.nome = nome;
		this.tipoDado = tipoDado;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoDado() {
		return tipoDado;
	}

	public void setTipoDado(String tipoDado) {
		this.tipoDado = tipoDado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Simbolo [nome=");
		builder.append(nome);
		builder.append(", tipoDado=");
		builder.append(tipoDado);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}

}
