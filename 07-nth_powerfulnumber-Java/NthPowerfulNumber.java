// nthPowerfulNumber(n) [20 pts]
// Write the function nthPowerfulNumber(n). See here for details. So nthPowerfulNumber(0) returns 
// 1, and nthPowerfulNumber(10) returns 64.
// A number n is said to be Powerful Number if for every prime factor p of it, p2 also divides it. 
// For example:- 36 is a powerful number. It is divisible by both 3 and square of 3 i.e, 9.

public class NthPowerfulNumber {
	public boolean isPowerfulNumber(int n){
		while (n % 2 == 0) {
            int power = 0;
            while (n % 2 == 0) {
                n /= 2;
                power++;
            }
            if (power == 1)
                return false;
        }

        for (int factor = 3; factor <= Math.sqrt(n); factor += 2) {
            int power = 0;
            while (n % factor == 0) {
                n = n / factor;
                power++;
            }
            if (power == 1)
                return false;
        }
        return (n == 1);
	}
	public long nthPowerfulNumber(int n) {
		// Your code goes here
		int found = 1;
		int guess = 0;
		while (found <= n)
			guess += 1;
			if (isPowerfulNumber(guess))
				found += 1;
		return guess; 
	}	
}