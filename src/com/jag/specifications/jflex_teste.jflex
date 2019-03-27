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

%{   
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
%}

numero 						= [0-9]

%%

"+"						{return new Symbol(sym.OP_ADICAO, yychar, yyline, yytext());}
"-"						{return new Symbol(sym.OP_SUB, yychar, yyline, yytext());}
{numero}+					{return new Symbol(sym.CONSTANTE, yychar, yyline, yytext());}


