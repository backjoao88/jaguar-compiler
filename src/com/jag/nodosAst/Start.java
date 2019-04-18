package com.jag.nodosAst;

public class Start {

	private Nodo start;
	private Nodo funcDeclaration;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Start [start=");
		builder.append(start);
		builder.append(", funcDeclaration=");
		builder.append(funcDeclaration);
		builder.append("]");
		return builder.toString();
	}

}
