package com.jag.parser;

public class VarSimbolo extends Simbolo {

	private String tipoDado = null;
	private String enderecoMemoria = null;

	public VarSimbolo(String nome, String tipoDado) {
		super(nome);
		this.tipoDado = tipoDado;
	}

	public VarSimbolo(String nome, String tipoDado, String enderecoMemoria) {
		super(nome);
		this.tipoDado = tipoDado;
		this.enderecoMemoria = enderecoMemoria;
	}

	public String getEnderecoMemoria() {
		return enderecoMemoria;
	}

	public void setEnderecoMemoria(String enderecoMemoria) {
		this.enderecoMemoria = enderecoMemoria;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VarSimbolo [nome=");
		builder.append(super.getNome());
		builder.append(", tipoDado=");
		builder.append(tipoDado);
		builder.append(", enderecoMemoria=");
		builder.append(enderecoMemoria);
		builder.append("]");
		return builder.toString();
	}

}
