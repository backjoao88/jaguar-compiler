package com.jag.ast;

public class ExpSoma extends Node{

	Node exp_sub = null;
	Node exp_soma_operador;

	public ExpSoma(Node exp_sub, Node exp_soma_operador) {
		this.exp_sub = exp_sub;
		this.exp_soma_operador = exp_soma_operador;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
	
		builder.append(exp_sub);
		builder.append(exp_soma_operador);
		builder.append("\n");
		
		return builder.toString();
	}
	
}
