//This is a subclass, of class NodeFact,
//collectively modeling the parse-tree fact.
//This class uses the NodeExpr class to get a variable expr
//that will return a the expression eval. 
public class NodeFactExpr extends NodeFact {

    private NodeExpr expr;

    public NodeFactExpr(NodeExpr expr) {
	this.expr=expr;
    }

    public Double eval(Environment env) throws EvalException {
	return expr.eval(env);
    }

}
