package com.jag.parser;

import java.util.HashMap;

public class TabelaSimbolos {

	private HashMap<String, Simbolo> tabelaSimbolos = new HashMap<String, Simbolo>();

	public void inserir(String key, Simbolo value) {
		if (value != null) {
			tabelaSimbolos.put(key, value);
		}
	}

	public void mostrar() {
		tabelaSimbolos.forEach((key, value) -> {
			System.out.println("Key ->" + key + ", valor -> " + value);
		});
	}

}
