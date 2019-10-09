//This is a subclass, of class Node,
//collectively modeling the parse-tree stmt.
//The statement will take in a assignment node
//and return the assinments eval.
public class NodeStmt extends Node {

    private NodeAssn assn;

    public NodeStmt(NodeAssn assn) {
	this.assn=assn;
    }

    public Double eval(Environment env) throws EvalException {
	return assn.eval(env);
    }

}
