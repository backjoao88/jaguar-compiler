
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Mar 27 10:04:11 BRT 2019
//----------------------------------------------------

package com.jag.parser;

import com.jag.ast.Constante;
import com.jag.ast.ExpSoma;
import com.jag.ast.ExpSomaOperador;
import com.jag.ast.ExpSub;
import com.jag.ast.ExpSubOperador;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Mar 27 10:04:11 BRT 2019
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\007\000\002\002\004\000\002\002\004\000\002\004" +
    "\004\000\002\004\002\000\002\003\004\000\002\005\004" +
    "\000\002\005\002" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\013\000\004\004\004\001\002\000\010\002\ufffb\005" +
    "\ufffb\006\014\001\002\000\004\002\012\001\002\000\006" +
    "\002\ufffe\005\007\001\002\000\004\004\004\001\002\000" +
    "\004\002\001\001\002\000\004\002\uffff\001\002\000\004" +
    "\002\000\001\002\000\006\002\ufffd\005\ufffd\001\002\000" +
    "\004\004\004\001\002\000\006\002\ufffc\005\ufffc\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\013\000\006\002\004\003\005\001\001\000\004\005" +
    "\012\001\001\000\002\001\001\000\004\004\007\001\001" +
    "\000\006\002\010\003\005\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\003\014\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // EXP_SUB_OPERADOR ::= 
            {
              ExpSubOperador RESULT =null;
		 System.out.println("EXP_SUB_OPERADOR"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXP_SUB_OPERADOR",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // EXP_SUB_OPERADOR ::= OP_SUB EXP_SUB 
            {
              ExpSubOperador RESULT =null;
		int exp_subleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int exp_subright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ExpSub exp_sub = (ExpSub)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXP_SUB_OPERADOR",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // EXP_SUB ::= CONSTANTE EXP_SUB_OPERADOR 
            {
              ExpSub RESULT =null;
		int constleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int constright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Constante constante = (Constante)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int exp_sub_operadorleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int exp_sub_operadorright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ExpSubOperador exp_sub_operador = (ExpSubOperador)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 System.out.println("EXP_SUB"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXP_SUB",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // EXP_SOMA_OPERADOR ::= 
            {
              ExpSomaOperador RESULT =null;
		 System.out.println("EXP_SOMA_OPERADOR");  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXP_SOMA_OPERADOR",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // EXP_SOMA_OPERADOR ::= OP_ADICAO EXP_SOMA 
            {
              ExpSomaOperador RESULT =null;
		int exp_somaleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int exp_somaright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ExpSoma exp_soma = (ExpSoma)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXP_SOMA_OPERADOR",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= EXP_SOMA EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ExpSoma start_val = (ExpSoma)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // EXP_SOMA ::= EXP_SUB EXP_SOMA_OPERADOR 
            {
              ExpSoma RESULT =null;
		int exp_subleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int exp_subright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ExpSub exp_sub = (ExpSub)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int exp_soma_operadorleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int exp_soma_operadorright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ExpSomaOperador exp_soma_operador = (ExpSomaOperador)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 System.out.println("EXP_SOMA"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXP_SOMA",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

