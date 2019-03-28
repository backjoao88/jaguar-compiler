package com.jag.ast;

public class ExpSomaOperador extends Node {

	String op_adicao = null;
	Node exp_soma = null;

	public ExpSomaOperador(String op_adicao, Node exp_soma) {
		this.op_adicao = op_adicao;
		this.exp_soma = exp_soma;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		//builder.append("\n[EXP-SOMA-OPERADOR]");
		builder.append("[EXP-SOMA-OPERADOR]-->" + op_adicao);
		builder.append("\n[EXP-SOMA-OPERADOR]-->" + exp_soma);
		//builder.append("\n");
		return builder.toString();
	}

}
