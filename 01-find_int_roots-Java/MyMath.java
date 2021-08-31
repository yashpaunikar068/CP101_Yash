// Write the function findIntRoots(a,b,c) that takes 
// the int coefficients a, b, c of a quadratic equation of this form:
//      y = ax2 + bx + c
// You are guaranteed the function has 2 real roots, and in fact that 
// the roots are all integers. Your function should return these 2 int roots as a list
// in increasing order. How does a function return multiple values? Like so:
// return root1, root2

import java.lang.Math;
public class MyMath {
	public int[] find_int_roots(int a, int b, int c){
		int[] arr = new int[2];
		double d = b * b - 4.0 * a * c;  
		double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
		double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
		arr[0] = (int)r1;
		arr[1] = (int)r2;
		return arr;
	}
}