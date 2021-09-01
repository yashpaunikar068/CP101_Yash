import java.util.*;

class BinarySearch {
	public int binary_search(int[] arr, int value){
        // Your code goes here
                Arrays.sort(arr);
                return Arrays.binarySearch(arr, value) > 0 ? Arrays.binarySearch(arr, value) : -1;
	}
}