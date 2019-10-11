//This is a subclass, of class Node,
//collectively modeling the parse-tree stmt.
//The class uses a assignment node
//and returns the assignment eval in the enviroment.
public class NodeStmt extends Node {

    private NodeAssn assn;

    public NodeStmt(NodeAssn assn) {
	this.assn=assn;
    }

    public Double eval(Environment env) throws EvalException {
	return assn.eval(env);
    }

}
