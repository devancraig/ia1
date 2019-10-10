//This is a subclass, of class Node,
//collectively modeling the parse-tree Assn.
//This class creates everything needed for an
//assignment. Then will be tested in the parser
//using it arguments of an id and expr
public class NodeAssn extends Node {

    private String id;
    private NodeExpr expr;

    public NodeAssn(String id, NodeExpr expr) {
	this.id=id;
	this.expr=expr;
    }

    public Double eval(Environment env) throws EvalException {
	return env.put(id,expr.eval(env));
    }

}
