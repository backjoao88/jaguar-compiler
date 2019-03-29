package com.jag.parser;

import java.util.HashMap;

public class SymbolTable {

	private HashMap<String, SymST> symbolTable = new HashMap<String, SymST>();

	public void adicionarSimbolo(String lex, SymST simbolo) {
		if (simbolo != null)
			symbolTable.put(lex, simbolo);
	}

	public void removerSimbolo(String lex) {
		if (lex != null)
			symbolTable.remove(lex);
	}

	public void mostrarTabelaSimbolos() {
		symbolTable.forEach((key, value) -> {
			System.out.println("Key --> " + key + ", Símbolo --> " + value.toString());
		});
	}

}
