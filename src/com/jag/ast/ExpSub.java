package com.jag.ast;

public class ExpSub extends Node {

	Integer constante = null;
	Node exp_sub_operador = null;

	public ExpSub(Integer constante, Node exp_sub_operador) {
		this.constante = constante;
		this.exp_sub_operador = exp_sub_operador;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		//builder.append("\n[EXP-SUB]");
		builder.append("[EXP-SUB]-->" + constante);
		builder.append("\n[EXP-SUB]-->" + exp_sub_operador);
		//builder.append("\n");
		return builder.toString();
	}

}
