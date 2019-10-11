//This is a subclass, of class NodeFact,
//collectively modeling the parse-tree fact.
//This class takes in a string for a number
//then is returned as parsed double.
public class NodeFactNum extends NodeFact {

    private String num;

    public NodeFactNum(String num) {
	this.num=num;
    }

    public Double eval(Environment env) throws EvalException {
	return Double.parseDouble(num);
    }

}
