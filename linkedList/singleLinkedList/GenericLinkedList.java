package linkedList.singleLinkedList;

public class GenericLinkedList<E> {
	class Node{
		E data;
		Node next;
		public Node(E data) {
			this.data = data;
			next = null;
		}
	}
	
	Node head;
	void add(E data) {
		Node add = new Node(data);
		Node temp = head;
		if(head == null) {
			head = add;
			return;
		}
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = add;
		temp = add;
	}
	void print() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

}
