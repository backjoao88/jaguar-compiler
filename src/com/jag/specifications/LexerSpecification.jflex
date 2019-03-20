package com.jag.lexer;
import com.jag.parser.sym;
import java_cup.runtime.Symbol;


%%

%class Lexer
%cup
%unicode
%public
%line
%column
%eofval{
	return new Symbol(sym.EOF, new String("Fim do arquivo"));
%eofval}
%standalone
%{   
    /* To create a new java_cup.runtime.Symbol with information about
       the current token, the token will have no value in this
       case. */
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    
    /* Also creates a new java_cup.runtime.Symbol with information
       about the current token, but this object has a value. */
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}

letra	 					= [a-zA-Z]
numero 						= [0-9]
aspas 						= [\"]
apostrofo 					= [\']
whitespace 					= [\n\r\b\s\t]
string_vazia 					= {aspas}{aspas}
string 						= {aspas} [^\"]+ {aspas}
string_caracter 				= {apostrofo} [^\']+ {apostrofo}
string_caracter_vazio  				= {apostrofo} {apostrofo}

%%

/* Palavras Chave */

"function"					{return new Symbol(sym.FUNCTION, yychar, yyline, yytext());}
"if"						{return new Symbol(sym.IF, yychar, yyline, yytext());}
"int"						{return new Symbol(sym.INT, yychar, yyline, yytext());}
"str"						{return new Symbol(sym.STR, yychar, yyline, yytext());}
"charac"					{return new Symbol(sym.CHARAC, yychar, yyline, yytext());}
"bool"						{return new Symbol(sym.BOOL, yychar, yyline, yytext());}
"real"						{return new Symbol(sym.REAL, yychar, yyline, yytext());}
"void"						{return new Symbol(sym.VOID, yychar, yyline, yytext());}
"return"					{return new Symbol(sym.RETURN, yychar, yyline, yytext());}
"for"						{return new Symbol(sym.FOR, yychar, yyline, yytext());}
"in"						{return new Symbol(sym.IN, yychar, yyline, yytext());}
"true"						{return new Symbol(sym.TRUE, yychar, yyline, yytext());}
"false"						{return new Symbol(sym.FALSE, yychar, yyline, yytext());}
"while"						{return new Symbol(sym.WHILE, yychar, yyline, yytext());}
"else"						{return new Symbol(sym.ELSE, yychar, yyline, yytext());}	
"elif"						{return new Symbol(sym.ELIF, yychar, yyline, yytext());}
"input"						{return new Symbol(sym.INPUT, yychar, yyline, yytext());}
"print"						{return new Symbol(sym.PRINT, yychar, yyline, yytext());}
	
/* Operadores */

"=="						{return new Symbol(sym.OP_COMPARACAO, yychar, yyline, yytext());}
"<"						{return new Symbol(sym.OP_MENOR, yychar, yyline, yytext());}
">="						{return new Symbol(sym.OP_MAIORIGUAL, yychar, yyline, yytext());}
"<="						{return new Symbol(sym.OP_MENORIGUAL, yychar, yyline, yytext());}
">"						{return new Symbol(sym.OP_MAIOR, yychar, yyline, yytext());}
"="						{return new Symbol(sym.OP_ATRIBUICAO, yychar, yyline, yytext());}

/* Operatores lógicos */

"and"						{return new Symbol(sym.OP_E, yychar, yyline, yytext());}
"or"						{return new Symbol(sym.OP_OU, yychar, yyline, yytext());}
"not"						{return new Symbol(sym.OP_NOT, yychar, yyline, yytext());}

/* Operadores aritiméticos */

"+"						{return new Symbol(sym.OP_ADICAO, yychar, yyline, yytext());}
"-"						{return new Symbol(sym.OP_SUBTRACAO, yychar, yyline, yytext());}
"/"						{return new Symbol(sym.OP_DIV, yychar, yyline, yytext());}
"*"						{return new Symbol(sym.OP_MULT, yychar, yyline, yytext());}


/* Caracteres Únicos */

"("						{return new Symbol(sym.ABRIR_PAR, yychar, yyline, yytext());}
")"						{return new Symbol(sym.FECHAR_PAR, yychar, yyline, yytext());}
"{"						{return new Symbol(sym.ABRIR_BLOCO, yychar, yyline, yytext());}
"}"						{return new Symbol(sym.FECHAR_BLOCO, yychar, yyline, yytext());}
","						{return new Symbol(sym.VIRGULA, yychar, yyline, yytext());}
"."						{return new Symbol(sym.PONTO, yychar, yyline, yytext());}

/* Expressões regulares compostas */


{letra}+({letra}|{numero})*			{return new Symbol(sym.IDENTIFICADOR, yychar, yyline, yytext());}
{string_vazia}					{return new Symbol(sym.STRING_VAZIA, yychar, yyline, yytext());}
{string}					{return new Symbol(sym.STRING, yychar, yyline, yytext());}
{string_caracter}				{return new Symbol(sym.STRING_CHARAC, yychar, yyline, yytext());}
{string_caracter_vazio}				{return new Symbol(sym.STRING_CHARAC_VAZIA, yychar, yyline, yytext());}
{numero}+					{return new Symbol(sym.CONSTANTE, yychar, yyline, yytext());}
{whitespace}+					{}
