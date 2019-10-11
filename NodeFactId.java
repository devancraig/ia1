//This is a subclass, of class NodeFact,
//collectively modeling the parse-tree fact.
//This class takes in a string Id
//which is used to hold the Id when it is
//returned along with the position.
public class NodeFactId extends NodeFact {
    private String id;

    public NodeFactId(int pos, String id) {
	this.pos=pos;
	this.id=id;
    }

    public Double eval(Environment env) throws EvalException {
	return env.get(pos,id);
    }

}
