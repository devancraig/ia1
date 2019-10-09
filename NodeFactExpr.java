public class NodeFactExpr extends NodeFact {

    private NodeExpr expr;

    public NodeFactExpr(NodeExpr expr) {
	this.expr=expr;
    }

    public Double eval(Environment env) throws EvalException {
	return expr.eval(env);
    }

}
