//This class is used to find syntax exceptions by using three arguments
//1. The position at which there is a syntax exception
//2. The expected syntax exception using a token
//3. The found syntax exception using a token
public class SyntaxException extends Exception {

    private int pos;
    private Token expected;
    private Token found;

    public SyntaxException(int pos, Token expected, Token found) {
	this.pos=pos;
	this.expected=expected;
	this.found=found;
    }

    public String toString() {
	return "syntax error"
	    +", pos="+pos
	    +", expected="+expected
	    +", found="+found;
    }

}
