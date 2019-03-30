package com.jag.parser;

public class Simbolo {

	private String nome = null;
	private String tipoDado = null;
	private String tipo = null;
	private int escopo = 0;

	public Simbolo(String nome, String tipoDado, String tipo, int escopo) {
		super();
		this.nome = nome;
		this.tipoDado = tipoDado;
		this.tipo = tipo;
		this.escopo = escopo;
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

	public int getEscopo() {
		return escopo;
	}

	public void setEscopo(int escopo) {
		this.escopo = escopo;
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
		builder.append(", escopo=");
		builder.append(escopo);
		builder.append("]");
		return builder.toString();
	}

}
