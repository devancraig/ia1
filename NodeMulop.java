//This is a subclass, of class Node,
//collectively modeling the parse-tree mulop.
//This class does two things, first is to check which
//operation it is dealing with multiplication or division.
//It does this by taking in two argument the string containing
//the operation and int for the position. Then will check to see
//which operation it is and return the pos and the mulop. 
public class NodeMulop extends Node {

    private String mulop;

    public NodeMulop(int pos, String mulop) {
	this.pos=pos;
	this.mulop=mulop;
    }

    public Double op(double o1, double o2) throws EvalException {
	if (mulop.equals("*"))
	    return o1*o2;
	if (mulop.equals("/"))
	    return o1/o2;
	throw new EvalException(pos,"bogus mulop: "+mulop);//If nothing is found it returns an error
    }

}
