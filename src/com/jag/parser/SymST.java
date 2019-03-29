package com.jag.parser;

public class SymST {

	private String lex = null;
	private int tipo = 0;

	public SymST(String lex, int tipo) {
		this.tipo = tipo;
		this.lex = lex;

	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SymST [lex=");
		builder.append(lex);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}

}
