// 	verlap(left1, top1, width1, height1, left2, top2, width2, height2)
// A rectangle can be described by its left, top, width, and height. This function 
// takes two rectangles described this way, and returns True if the rectangles 
// overlap at all (even if just at a point), and False otherwise. 
// Note: here we will represent coordinates the way they are usually represented in 
// computer graphics, where (0,0) is at the left-top corner of the screen, and while 
// the x-coordinate goes up while you head right, the y-coordinate goes up while you 
// head down (so we say that "up is down")

class Point {
	int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}
public class Rectangle {
	public boolean overlap(Point l1, Point r1, Point l2, Point r2){
		if (l1.x == r1.x || l1.y == r1.y || l2.x == r2.x || l2.y == r2.y)
            {
                return false;
            }
        if (l1.x >= r2.x || l2.x >= r1.x) {
            return false;
        }
        if (r1.y >= l2.y || r2.y >= l1.y) {
            return false;
        }
        return true;
	}
	public boolean rectangleOverlap(int left1, int top1, 
	int width1, int height1, 
	int left2, int top2, 
	int width2, int height2) {
		// Your code goes here...
		return overlap(new Point(left1, height2), new Point(width2, top2), new Point(left1, height1), new Point(width1, top1));
	}
}

/*

l2, h2      W2, T2
!!!!!!!!!!!!!
!
!
!
!!!!!!!!!!!!!
l1, h1     W1, T1

 */