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
	public void add(E data) {
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
	public void delete() {
		if(head==null) {
			return ;
		}
		Node temp = head;
		if(temp.next==null) {
			System.out.println(head.data);
			head= null;
		}
		else {
		while(temp.next.next!=null) {
			temp = temp.next;
		}
		System.out.println(temp.next.data);
		temp.next = null;}
	}
	public void find() {
		if(head==null) {
			return ;
		}
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		System.out.println(temp.data);
		//head = head.next;
	}

}
