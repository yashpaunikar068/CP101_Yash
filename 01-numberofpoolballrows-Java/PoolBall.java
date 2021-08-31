// Pool balls are arranged in balls where the first row contains 1 pool ball and each row contains 1
// more pool ball than the previous row. 
// numberOfPoolBallRows(balls) that takes a non-negative int number of pool balls, and returns the 
// smallest int number of balls required for the given number of pool balls. Thus, numberOfPoolBallRows(6) 
// returns 3. Note that if any balls must be in a row, then you count that row, and so 
// numberOfPoolBallRows(7) returns 4 (since the 4th row must have a single ball in it).

public class PoolBall {
	public int numberofpoolballrows(int balls) {
		// Your code goes here...
		int count = 0;
		int i = 0;
		for(i = 1; count < balls; i++){
			count += i;
		}
		return i-1;
	}
}
