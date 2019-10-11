//This is a subclass, of class Node,
//collectively modeling the parse-tree Assn.
//This class creates everything needed for an
//assignment using a string for id and node expr
//which is then put into the enviroment. 
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
