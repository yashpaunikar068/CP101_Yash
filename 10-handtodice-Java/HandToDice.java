// Write the (very short) function handtodice(hand) that takes a hand, which is a 3-digit
// integer, and returns 3 values, each of the 3 dice in the hand. For example:
// assert(handToDice(123) == (1,2,3))
// assert(handToDice(214) == (2,1,4))
// assert(handToDice(422) == (4,2,2))
// Hint: You might find and % useful here, and also getKthDigit().

public class HandToDice {
	public int[] handToDice(int hand) {
		int last = hand%10;
		hand = hand/10;
		int mid = hand%10;
		hand = hand/10;
		int first = hand%10;
		return {first, mid, last};
	}
}
