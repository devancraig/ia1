//This is a subclass, of class Node,
//collectively modeling the parse-tree Addop.
//This class uses a string addop to create a 
//double op that checks for "+" and "-". Then
//returns this in the parser to complete the addop. 
public class NodeAddop extends Node {

    private String addop;

    public NodeAddop(int pos, String addop) {
	this.pos=pos;
	this.addop=addop;
    }

    public Double op(double o1, double o2) throws EvalException {
	if (addop.equals("+"))
	    return o1+o2;
	if (addop.equals("-"))
	    return o1-o2;
	throw new EvalException(pos,"bogus addop: "+addop);
    }

}
