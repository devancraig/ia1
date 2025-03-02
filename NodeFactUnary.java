//This is a subclass, of class NodeFact,
//collectively modeling the parse-tree fact.
//This class takes in a fact which then will be 
//multiplied by one to return the negative number.
public class NodeFactUnary extends NodeFact {
	private NodeFact fact;
	
	public NodeFactUnary(NodeFact fact){
       this.fact = fact;
    }
	
	public Double eval(Environment env) throws EvalException{
		return fact.eval(env) * -1;
    }

}