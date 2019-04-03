package com.jag.parser;

import java.util.Arrays;

public class FuncaoSimbolo extends Simbolo {

	private String tipoRetorno = null;
	private String[] parametros = null;
	
	public FuncaoSimbolo(String nome, String tipoRetorno) {
		super(nome);
		this.tipoRetorno = tipoRetorno;
	}

	public FuncaoSimbolo(String nome, String tipoRetorno, String[] parametros) {
		super(nome);
		this.tipoRetorno = tipoRetorno;
		this.parametros = parametros;
	}

	public String[] getParametros() {
		return parametros;
	}

	public void setParametros(String[] parametros) {
		this.parametros = parametros;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FuncaoSimbolo [nome=");
		builder.append(super.getNome());
		builder.append(", tipoRetorno=");
		builder.append(tipoRetorno);
		builder.append(", parametros=");
		builder.append(Arrays.toString(parametros));
		builder.append("]");
		return builder.toString();
	}

}
