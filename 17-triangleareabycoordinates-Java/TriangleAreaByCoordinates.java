// triangleareabycoordinates(x1, y1, x2, y2, x3, y3)[5pts]
// Write the function triangleareabycoordinates(x1, y1, x2, y2, x3, y3) that takes 6 int or float
// values that represent the three points (x1,y1), (x2,y2), and (x3,y3), and returns as a float the
// area of the triangle formed by those three points. Hint: you should make constructive use of
// the triangleArea function you just wrote above.

public class TriangleAreaByCoordinates {
	public int triangleAreaByCoordinates(double x1, double y1, double x2, double y2, double x3, double y3) {
		// Your code goes here
		double[] X = {x1, x2, x3};
		double[] Y = {y1, y2, y3};
		int n = X.length;
		return (int)area(X, Y, n);
	}
	public double area(double X[], double Y[], int n){
		double area = 0.0;
        int j = n - 1;
        for (int i = 0; i < n; i++)
        {
            area += (X[j] + X[i]) * (Y[j] - Y[i]);
            j = i;
        }
        return Math.abs(area / 2.0);
	}
}