
class Element{
	int value;
	Element next;
	public Element(int value){
		this.value = value;
		this.next = null;
	}
}

public class LinkedList{
	Element head;
	public LinkedList(Element head){
		this.head = head;
	}

	public void append(Element new_element){
		// Your code goes here
		Element curr = head;
		while(curr.next != null){
			curr = curr.next;
		}
		curr.next = new_element;
	}

	public Element get_position(int position){
		// Get an element from a particular position.
        // Assume the first position is "1".
        // Return null if position is not in the list
		// Your code goes here
		Element curr = head;
		int count = 1;
		while(count < position){
			curr = curr.next;
			count++;
		}
		return curr;
	}

	public void insert(Element new_element, int position){
	   // """Insert a new node at the given position.
       // Assume the first position is "1".
       // Inserting at position 3 means between
       // the 2nd and 3rd elements."""
		// Your code goes here
		Element curr = head;
		while(position > 0){
			curr = curr.next;
			position--;
		}
		Element temp = curr.next;
		new_element = curr.next;
		new_element.next = temp;
	}

	public void delete(int value){
		// Delete the first node with a given value.
		// Your code goes here
		if(head.value == value)
			head = head.next;
		Element curr = head;
		while(curr.next != null){
			if(curr.next.value == value)
				curr.next = curr.next.next;
		}
	}
}
