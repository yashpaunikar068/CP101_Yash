// # Write the function getInRange(x, bound1, bound2) which takes 3 int values
// # x, bound1, and bound2, where bound1 is not necessarily less than bound2. 
// # If x is between the two bounds, just return it unmodified. Otherwise, 
// # if x is less than the lower bound, return the lower bound, 
// # or if x is greater than the upper bound, return the upper bound.

class GetInRange {
	public int getInRange(int x, int bound1, int bound2){
		int lb = Math.min(bound1, bound2);
		int ub = Math.max(bound1, bound2);
		if(x <= lb)
			return lb;
		else if(x > lb && x < ub)
			return x;
		else 
			return ub;
	}
}