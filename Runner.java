package linkedList;

public class Runner {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.insert(12);
		ll.insert(20);
		ll.insert(24);
		ll.insert(14);
		
		ll.insertAtStart(200);
		
		ll.insertAt(1, 400);
		ll.insertAt(2, 800);
		
		ll.deleteAt(2);
		ll.deleteAt(1);
		
		ll.show();

	}
}
