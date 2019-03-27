package com.jag.ast;

public class ExpSubOperador extends Node {

	String op_sub = null;
	Node exp_sub = null;

	public ExpSubOperador(String op_sub, Node exp_sub) {
		this.op_sub = op_sub;
		this.exp_sub = exp_sub;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(op_sub);
		builder.append(exp_sub);
		builder.append("\n");
		return builder.toString();
	}

}
