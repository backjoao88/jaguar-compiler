package com.jag.semantico;

import com.jag.nodosAst.Nodo;

public class ASTTree {

	private Nodo raiz;

	public Nodo getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}

	public void visitarTodos(Visitor visitor) {
		visitor.visitar(raiz);
	}

}
