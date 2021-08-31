// removeRowAndCol
// Here we will write removeRowAndCol(row, col), 
// Do not use copy.deepcopy and directly construct the 
// modified 2d list.

// The function takes a rectangular list L and two ints, 
// row and col. the goal is to obtain a version of the list that 
// has the given row and given column removed. You may assume that 
// row and col are both legal values (that is, they are 
// non-negative integers that are smaller than the largest 
// row and column, respectively). For example, the list shown 
// to the left would lead to the result shown on the right
//  when called with row 1 and column 2.

// list
// [ [ 2, 3, 4, 5],
//   [ 8, 7, 6, 5],
//   [ 0, 1, 2, 3] ]

// result
// [ [ 2, 3, 5],
//   [ 0, 1, 3] ]

public class List {
    public static int[][] removeRowAndCol(int[][] arr, int row, int col) {
        // Your code goes here...
        int ans[][] = new int[arr.length-1][arr[0].length-1];
        int p = 0;
        for( int i = 0; i < arr.length; ++i)
        {
            if ( i == row)
                continue;


            int q = 0;
            for( int j = 0; j < arr[0].length; ++j)
            {
                if ( j == col)
                    continue;

                ans[p][q] = arr[i][j];
                ++q;
            }

            ++p;
        }
        return ans;
    }

    public static void main(String[] args) {
        // Write your own test cases
        int[][] ans = {{2, 3, 5}, {0, 1, 3}};
        int[][] ques = {{ 2, 3, 4, 5}, {8, 7, 6, 5}, {0, 1, 2, 3}};
        if(removeRowAndCol(ques, 1, 2) == ans)
            System.out.println("Passed the test case!");
        else
            System.out.println("not passed");
    }
}

