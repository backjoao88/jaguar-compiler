package com.jag.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import com.jag.lexer.Lexer;
import com.jag.parser.parser;

public class Application {

	public static void main(String[] args) {

		//final String DIRECTORY = "C:\\Users\\joao.back\\Desktop\\workspace\\jaguar-compiler\\examples\\";
		//final String DIRECTORY = "/home/joaop/jaguar-compiler/examples/";
		//final String DIRECTORY = "C:\\Users\\mathias.schulz\\eclipse-workspace\\jaguar-compiler\\examples\\";
		
		final String DIRECTORY = "/home/joaop/jaguar-compiler/examples/";
		
		final String FILE_NAME = "file_test1.txt";

		try {
			@SuppressWarnings("deprecation")
			parser p = new parser(new Lexer(new FileReader(DIRECTORY + FILE_NAME)));
			p.parse();
			System.out.println("Success!");
		} catch (FileNotFoundException e1) {
			System.err.println("Arquivo n�o encontrado: " + e1.getMessage() + "\n");
		} catch (Exception e2) {
			System.err.println("Exce��o gen�rica. Erro: " + e2.getMessage()+ "\n");
		} finally {
			System.out.println("Fim do teste.");
		}

	}

}
