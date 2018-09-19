package aughem;

public class ReversedChecker {
	boolean reversed;
	String a,b;
	
	public ReversedChecker(String a, String b) {
		this.a = a.toLowerCase().trim();
		this.b = b.toLowerCase().trim();
		this.reversed = isReversed(a,b);
	}//Constructor
	
	private boolean isReversed(String a, String b) {
		return isReversed(a.toLowerCase().trim(),b.toLowerCase().trim(),a.length()-1);
	} //isReversed
	
	private boolean isReversed(String a, String b, int n) {
		if (a.length() != b.length()) {
			return false;
		} else if (a.charAt(a.length()-1-n) == b.charAt(n)) {
			System.out.println("Checking: " + a.charAt(a.length()-1-n) + " == " + b.charAt(n));
			if (n == 0) {
				return true;
			} else {
				return isReversed(a,b,n-1);
			} //if else
		} else {
			return false;
		} //else if
	}//isReversed
	
	public String toString(){
		return "[ReversedChecker] " + a + " : " + b + " : " + reversed;
	} //toString
}//Class
