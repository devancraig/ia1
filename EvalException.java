//EvalException is used to take in a position and a string message and 
//read out to the console. When read out it will display the 
//error and what variable broke the function. 
public class EvalException extends Exception {

    private int pos;
    private String msg;

    public EvalException(int pos, String msg) {
	this.pos=pos;
	this.msg=msg;
    }

    public String toString() {
	return "eval error"
	    +", pos="+pos
	    +", "+msg;
    }

}
