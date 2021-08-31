// largestPerfectSquare(n) [10 pts]
// Write the function largestPerfectSquare(n) that takes a non-negative int n, and returns  the largest perfect
// square that is no larger than n. For example:
// assert(largestPerfectSquare(24) == 16)
// assert(largestPerfectSquare(25) == 25)
// assert(largestPerfectSquare(26) == 25)
// Hint: you may wish to use a similar approach to how you solved isPerfectSquare on the hw.
// Another hint: This can be written using just one or two lines of Python.

public class MyMath {
	public int largestPerfectSquare(int n) {
		// Your code goes here
		int square = 0;
		int i;
		for (i = 1; square < n; i++) {
			square = i*i;
		}
		if(square == n)
			return (i-1)*(i-1);
		return (i-2)*(i-2);
	}
}