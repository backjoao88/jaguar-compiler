package com.jag.parser;

public class SymST {

	private String lex = null;
	private int tipo = 0;
	private int escopo = 0;

	public SymST(String lex, int tipo) {
		this.tipo = tipo;
		this.lex = lex;
		this.escopo = 0;

	}

	public int getEscopo() {
		return escopo;
	}

	public void setEscopo(int escopo) {
		this.escopo = escopo;
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
		builder.append("[Lexema = ");
		builder.append(lex);
		builder.append(", tipo = ");
		builder.append(tipo);
		builder.append(", escopo = ");
		builder.append(escopo);
		builder.append("]");
		return builder.toString();
	}

}
