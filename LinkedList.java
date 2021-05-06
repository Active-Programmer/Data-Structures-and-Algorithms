package linkedList;

public class LinkedList {
	
	Node head;

//	Insert the data at the end of the Linked List
	
	public void insert(int data) {
		
		Node node = new Node();
		
		node.data = data;
		node.next = null;
		
		if(head == null) {
			head = node;
		}
		else {
			Node n = head;
			
			while(n.next!=null) {
				n = n.next;
			}
			
			n.next = node;
		}	
		
	}
	
//	Insert the data at the start
	
	public void insertAtStart(int data) {
		Node node = new Node();
		
		node.data = data;
		node.next = null;
		
		if(head == null) {
			head = node;
		}
		else {
			node.next= head;
			head = node;
		}
	}
	
//	Insert the data at the particular location
	
	public void insertAt(int pos, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		int i=0;
		Node n = head;
		
		if(pos==0) {
			insertAtStart(data);
		}
		
		else {
			
		
			while(i<pos-1) {
				n = n.next;
				i++;
			}
		}
		
		node.next = n.next;
		n.next = node;
	}
	
	public void deleteAt(int pos) {
		
		Node n = head;
		int i=0;
		
		if(pos == 0) {
			head = head.next;
		}
		
		else {
			while(i<pos-1) {
				n = n.next;
				i++;
			}
			
			Node n1 = n.next;
			n.next = n1.next;
			n1.next = null;
			
		}
	}
	
//	Displaying all the elements
	
	public void show() {
		Node n = head;
		int counter = 0;
		
		while(n.next!=null) {
			System.out.println(n.data);
			n = n.next;
			counter+=1;
		}
		
		System.out.println(n.data);
		System.out.print("Total Element are :");
		System.out.println(counter+1);
		
	}

}
