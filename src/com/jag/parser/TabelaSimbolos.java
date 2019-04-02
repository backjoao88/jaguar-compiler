package com.jag.parser;

import java.util.HashMap;
import java.util.Stack;

public class TabelaSimbolos {

	private Stack<HashMap<String, Simbolo>> tabelaSimbolos = new Stack<HashMap<String, Simbolo>>();

	public void inserir(String key, Simbolo value) {
		if (value != null) {
			tabelaSimbolos.peek().put(key, value);
		}
	}

	public void mostrar() {
		for (int i = 0; i < tabelaSimbolos.size(); i++) {
			System.out.println("Escopo: " + i);
			tabelaSimbolos.get(i).forEach((key, value) -> {
				System.out.println("Key ->" + key + ", valor -> " + value);
			});
		}
	}

	public void novoEscopo() {
		tabelaSimbolos.push(new HashMap<String, Simbolo>());
	}

	public void limparEscopo() {
		tabelaSimbolos.pop();
	}

}
