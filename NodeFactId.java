//This is a subclass, of class NodeFact,
//collectively modeling the parse-tree fact.
//An Id is determined if there is a found
//string for an Id at a certian position. If
//an Id is found then it will return a double with a position and an Id.
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
