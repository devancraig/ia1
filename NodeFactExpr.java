//This is a subclass, of class NodeFact,
//collectively modeling the parse-tree fact.
//Uses the NodeExpr to get a variable expr
//that will return the enviroment of an expression
public class NodeFactExpr extends NodeFact {

    private NodeExpr expr;

    public NodeFactExpr(NodeExpr expr) {
	this.expr=expr;
    }

    public Double eval(Environment env) throws EvalException {
	return expr.eval(env);
    }

}
