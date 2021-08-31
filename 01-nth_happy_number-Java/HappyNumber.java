// Write the function nthHappyNumber(n) which takes a non-negative integer 
// and returns the nth happy number (where the 0th happy number is 1). 
// Here are some test assertions for you:

// https://en.wikipedia.org/wiki/Happy_number#:~:text=In%20number%20theory%2C%20a%20happy,starting%20with%20and%20eventually%20reaches
// Read more about the happy number from the above link.

// assert(nthHappyNumber(1) == 1)
// assert(nthHappyNumber(2) == 7)
// assert(nthHappyNumber(3) == 10)
// assert(nthHappyNumber(4) == 13)
// assert(nthHappyNumber(5) == 19)
// assert(nthHappyNumber(6) == 23)
// assert(nthHappyNumber(7) == 28)
// assert(nthHappyNumber(8) == 31)

public class HappyNumber {
	public int squareSum(int n){
		int squareSum = 0;
		while(n > 0){
			squareSum += (n % 10) * (n % 10);
			n = n/10;
		}	
		return squareSum;
	}
	public boolean isHappyNumber(int n) {
		int s = n;
        int f = n;
        while(true){
            s = squareSum(s);
            f = squareSum(squareSum(f));
            if(s != f)
                continue;
            else
                break;
		}
        return (s == 1);    
	}
	public int nthHappyNumber(int n){
		int found = 1;
		int guess = 0;
		while (found <= n){
			guess += 1;
			if (isHappyNumber(guess))
				found += 1;
		}
		return guess;	
	}
}