
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Thu Sep 15 16:29:45 CEST 2011
//----------------------------------------------------

package org.processmining.ltl2automaton.plugins.cup_parser;

import org.processmining.ltl2automaton.plugins.formula.DefaultFormulaFactory;
import org.processmining.ltl2automaton.plugins.formula.Formula;
import org.processmining.ltl2automaton.plugins.ltl.FormulaFactory;
import org.processmining.ltl2automaton.plugins.ltl.SyntaxParserException;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Thu Sep 15 16:29:45 CEST 2011
  */
public class ParserCup extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public ParserCup() {super();}

  /** Constructor which sets the default scanner. */
  public ParserCup(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserCup(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\022\000\002\002\005\000\002\002\004\000\002\002" +
    "\003\000\002\002\003\000\002\002\004\000\002\002\005" +
    "\000\002\002\005\000\002\002\005\000\002\002\005\000" +
    "\002\002\004\000\002\002\004\000\002\002\004\000\002" +
    "\002\004\000\002\002\005\000\002\002\005\000\002\002" +
    "\005\000\002\002\005\000\002\002\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\043\000\024\004\014\006\005\007\007\010\013\015" +
    "\006\016\012\017\004\020\015\025\010\001\002\000\024" +
    "\004\014\006\005\007\007\010\013\015\006\016\012\017" +
    "\004\020\015\025\010\001\002\000\026\002\uffff\005\uffff" +
    "\011\uffff\012\uffff\013\uffff\014\uffff\021\uffff\022\uffff\023" +
    "\uffff\024\uffff\001\002\000\024\004\014\006\005\007\007" +
    "\010\013\015\006\016\012\017\004\020\015\025\010\001" +
    "\002\000\026\002\ufffe\005\ufffe\011\ufffe\012\ufffe\013\ufffe" +
    "\014\ufffe\021\ufffe\022\ufffe\023\ufffe\024\ufffe\001\002\000" +
    "\026\002\ufff0\005\ufff0\011\ufff0\012\ufff0\013\ufff0\014\ufff0" +
    "\021\ufff0\022\ufff0\023\ufff0\024\ufff0\001\002\000\024\002" +
    "\043\011\022\012\024\013\020\014\023\021\026\022\017" +
    "\023\025\024\021\001\002\000\024\004\014\006\005\007" +
    "\007\010\013\015\006\016\012\017\004\020\015\025\010" +
    "\001\002\000\024\004\014\006\005\007\007\010\013\015" +
    "\006\016\012\017\004\020\015\025\010\001\002\000\024" +
    "\004\014\006\005\007\007\010\013\015\006\016\012\017" +
    "\004\020\015\025\010\001\002\000\024\004\014\006\005" +
    "\007\007\010\013\015\006\016\012\017\004\020\015\025" +
    "\010\001\002\000\026\002\ufff7\005\ufff7\011\ufff7\012\ufff7" +
    "\013\ufff7\014\ufff7\021\ufff7\022\ufff7\023\ufff7\024\ufff7\001" +
    "\002\000\024\004\014\006\005\007\007\010\013\015\006" +
    "\016\012\017\004\020\015\025\010\001\002\000\024\004" +
    "\014\006\005\007\007\010\013\015\006\016\012\017\004" +
    "\020\015\025\010\001\002\000\024\004\014\006\005\007" +
    "\007\010\013\015\006\016\012\017\004\020\015\025\010" +
    "\001\002\000\024\004\014\006\005\007\007\010\013\015" +
    "\006\016\012\017\004\020\015\025\010\001\002\000\024" +
    "\004\014\006\005\007\007\010\013\015\006\016\012\017" +
    "\004\020\015\025\010\001\002\000\024\004\014\006\005" +
    "\007\007\010\013\015\006\016\012\017\004\020\015\025" +
    "\010\001\002\000\024\004\014\006\005\007\007\010\013" +
    "\015\006\016\012\017\004\020\015\025\010\001\002\000" +
    "\024\004\014\006\005\007\007\010\013\015\006\016\012" +
    "\017\004\020\015\025\010\001\002\000\026\002\ufff4\005" +
    "\ufff4\011\ufff4\012\ufff4\013\ufff4\014\ufff4\021\ufff4\022\ufff4" +
    "\023\025\024\021\001\002\000\026\002\ufff2\005\ufff2\011" +
    "\ufff2\012\ufff2\013\ufff2\014\ufff2\021\ufff2\022\ufff2\023\ufff2" +
    "\024\ufff2\001\002\000\026\002\ufffb\005\ufffb\011\022\012" +
    "\ufffb\013\ufffb\014\ufffb\021\026\022\017\023\025\024\021" +
    "\001\002\000\026\002\ufff9\005\ufff9\011\022\012\024\013" +
    "\ufff9\014\ufff9\021\026\022\017\023\025\024\021\001\002" +
    "\000\026\002\ufffc\005\ufffc\011\ufffc\012\ufffc\013\ufffc\014" +
    "\ufffc\021\026\022\017\023\025\024\021\001\002\000\026" +
    "\002\ufff1\005\ufff1\011\ufff1\012\ufff1\013\ufff1\014\ufff1\021" +
    "\ufff1\022\ufff1\023\ufff1\024\ufff1\001\002\000\026\002\ufffa" +
    "\005\ufffa\011\022\012\024\013\ufffa\014\ufffa\021\026\022" +
    "\017\023\025\024\021\001\002\000\026\002\ufff3\005\ufff3" +
    "\011\ufff3\012\ufff3\013\ufff3\014\ufff3\021\ufff3\022\ufff3\023" +
    "\025\024\021\001\002\000\024\005\040\011\022\012\024" +
    "\013\020\014\023\021\026\022\017\023\025\024\021\001" +
    "\002\000\026\002\001\005\001\011\001\012\001\013\001" +
    "\014\001\021\001\022\001\023\001\024\001\001\002\000" +
    "\026\002\ufffd\005\ufffd\011\ufffd\012\ufffd\013\ufffd\014\ufffd" +
    "\021\ufffd\022\ufffd\023\ufffd\024\ufffd\001\002\000\026\002" +
    "\ufff5\005\ufff5\011\022\012\024\013\020\014\023\021\026" +
    "\022\017\023\025\024\021\001\002\000\004\002\000\001" +
    "\002\000\026\002\ufff6\005\ufff6\011\ufff6\012\ufff6\013\ufff6" +
    "\014\ufff6\021\ufff6\022\ufff6\023\ufff6\024\ufff6\001\002\000" +
    "\026\002\ufff8\005\ufff8\011\ufff8\012\ufff8\013\ufff8\014\ufff8" +
    "\021\ufff8\022\ufff8\023\ufff8\024\ufff8\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\043\000\004\002\010\001\001\000\004\002\044\001" +
    "\001\000\002\001\001\000\004\002\043\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\002" +
    "\041\001\001\000\004\002\040\001\001\000\004\002\036" +
    "\001\001\000\004\002\015\001\001\000\002\001\001\000" +
    "\004\002\035\001\001\000\004\002\034\001\001\000\004" +
    "\002\033\001\001\000\004\002\032\001\001\000\004\002" +
    "\031\001\001\000\004\002\030\001\001\000\004\002\027" +
    "\001\001\000\004\002\026\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserCup$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserCup$actions(this);
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
    return action_obj.CUP$ParserCup$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



	/**
	 * @see java_cup.runtime.lr_parser#report_error(java.lang.String, java.lang.Object)
	 */
	public void report_error(String message, Object info) { /* Ignore simple error */
	}

	/**
	 * @see java_cup.runtime.lr_parser#report_fatal_error(java.lang.String, java.lang.Object)
	 */
	public void report_fatal_error(String message, Object info) throws Exception {
		StringBuilder m = new StringBuilder("Error");

		if (info instanceof java_cup.runtime.Symbol) {
			java_cup.runtime.Symbol s = ((java_cup.runtime.Symbol) info);

			if (s.left >= 0) {
				m.append(" in line "+(s.left+1));
				if (s.right >= 0)
					m.append(", column "+(s.right+1));
			}
		}

		m.append(" : "+message);

		throw new SyntaxParserException(m.toString());
    }
    
    FormulaFactory<Formula> factory = DefaultFormulaFactory.instance;

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$ParserCup$actions {
  private final ParserCup parser;

  /** Constructor */
  CUP$ParserCup$actions(ParserCup parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$ParserCup$do_action(
    int                        CUP$ParserCup$act_num,
    java_cup.runtime.lr_parser CUP$ParserCup$parser,
    java.util.Stack            CUP$ParserCup$stack,
    int                        CUP$ParserCup$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserCup$result;

      /* select the action based on the action number */
      switch (CUP$ParserCup$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // formula ::= ID 
            {
              Formula RESULT =null;
		int apleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int apright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		String ap = (String)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = parser.factory.Proposition(ap); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("formula",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // formula ::= formula WRELEASES formula 
            {
              Formula RESULT =null;
		int f1left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).left;
		int f1right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).right;
		Formula f1 = (Formula)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).value;
		int f2left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int f2right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Formula f2 = (Formula)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = parser.factory.WRelease(f1, f2); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("formula",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // formula ::= formula RELEASES formula 
            {
              Formula RESULT =null;
		int f1left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).left;
		int f1right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).right;
		Formula f1 = (Formula)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).value;
		int f2left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int f2right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Formula f2 = (Formula)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = parser.factory.Release(f1, f2); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("formula",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // formula ::= formula WUNTIL formula 
            {
              Formula RESULT =null;
		int f1left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).left;
		int f1right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).right;
		Formula f1 = (Formula)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).value;
		int f2left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int f2right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Formula f2 = (Formula)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = parser.factory.WUntil(f1, f2); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("formula",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // formula ::= formula UNTIL formula 
            {
              Formula RESULT =null;
		int f1left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).left;
		int f1right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).right;
		Formula f1 = (Formula)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).value;
		int f2left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int f2right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Formula f2 = (Formula)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = parser.factory.Until(f1, f2); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("formula",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // formula ::= WNEXT formula 
            {
              Formula RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Formula f = (Formula)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = parser.factory.WNext(f); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("formula",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // formula ::= NEXT formula 
            {
              Formula RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Formula f = (Formula)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = parser.factory.Next(f); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("formula",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // formula ::= FUTURE formula 
            {
              Formula RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Formula f = (Formula)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = parser.factory.Eventually(f); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("formula",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // formula ::= GLOBALLY formula 
            {
              Formula RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Formula f = (Formula)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = parser.factory.Always(f); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("formula",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // formula ::= formula EQUALS formula 
            {
              Formula RESULT =null;
		int f1left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).left;
		int f1right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).right;
		Formula f1 = (Formula)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).value;
		int f2left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int f2right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Formula f2 = (Formula)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = parser.factory.Equal(f1, f2); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("formula",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // formula ::= formula IMPLIES formula 
            {
              Formula RESULT =null;
		int f1left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).left;
		int f1right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).right;
		Formula f1 = (Formula)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).value;
		int f2left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int f2right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Formula f2 = (Formula)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = parser.factory.Implies(f1, f2); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("formula",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // formula ::= formula OR formula 
            {
              Formula RESULT =null;
		int f1left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).left;
		int f1right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).right;
		Formula f1 = (Formula)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).value;
		int f2left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int f2right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Formula f2 = (Formula)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = parser.factory.Or(f1, f2); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("formula",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // formula ::= formula AND formula 
            {
              Formula RESULT =null;
		int f1left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).left;
		int f1right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).right;
		Formula f1 = (Formula)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).value;
		int f2left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int f2right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Formula f2 = (Formula)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = parser.factory.And(f1, f2); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("formula",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // formula ::= NOT formula 
            {
              Formula RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Formula f = (Formula)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = parser.factory.Not(f); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("formula",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // formula ::= FALSE 
            {
              Formula RESULT =null;
		 RESULT = parser.factory.False(); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("formula",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // formula ::= TRUE 
            {
              Formula RESULT =null;
		 RESULT = parser.factory.True(); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("formula",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= formula EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).right;
		Formula start_val = (Formula)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).value;
		RESULT = start_val;
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserCup$parser.done_parsing();
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // formula ::= LPAREN formula RPAREN 
            {
              Formula RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).right;
		Formula f = (Formula)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).value;
		 RESULT = f; 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("formula",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

