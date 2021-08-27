// isevenpositiveint(x)
// Write the function isevenpositiveint(x) that takes an arbitrary value x, return True if it is an
// integer, and it is positive, and it is even (all 3 must be True), or False otherwise. Do not
// crashing if the value is not an integer. isevenpositiveint(123456) returns True.

public class IsEvenPositiveInt {
	public boolean isEvenPositiveInt(int x) {
		// Your code goes here
		if(x < 0)
			return false;
		else if(x > 0 && x % 2 == 0)
			return true;
		return false;
	}
}