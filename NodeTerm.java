//This is a subclass, of class Node,
//collectively modeling the parse-tree term.
//This class takes in three variables a fact, mulop and
//recursively calls itself. Then uses these
//variables to return either a term, mulop or a fact. 

public class NodeTerm extends Node {

    private NodeFact fact;
    private NodeMulop mulop;
    private NodeTerm term;

    public NodeTerm(NodeFact fact, NodeMulop mulop, NodeTerm term) {
	this.fact=fact;
	this.mulop=mulop;
	this.term=term;
    }

    public void append(NodeTerm term) {
	if (this.term==null) {
	    this.mulop=term.mulop;
	    this.term=term;
	    term.mulop=null;
	} else
	    this.term.append(term);
    }

    public Double eval(Environment env) throws EvalException {
	return term==null
	    ? fact.eval(env)
	    : mulop.op(term.eval(env),fact.eval(env));
    }

}
