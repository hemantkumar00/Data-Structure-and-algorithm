package linkedList.singleLinkedList;

public class SingleLinkedList {
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	Node head;
	public void add(int data) {
		Node temp = head;
		Node add = new Node(data);
		if(head == null) {
			head = add;
			return;
		}
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = add;
	}
	public void print() {
		Node temp = head;
		if(head == null) {
			return;
		}
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public void delete() {
		Node temp = head;
		if(head == null) {
			return;
		}
		while(temp.next.next!=null) {
			temp = temp.next;
		}
		temp.next = null;
	}
	public void delete(int data) {
		Node temp = head;
		while(temp.next.next!=null) {
			if(temp.next.data==data) {
				temp.next = temp.next.next;
				return;
			}
			temp = temp.next;
		}
		
	}
	public void search(int data) {
		Node temp = head;
		if(head.data==data) {
			System.out.println(head.data);
		}
		while(temp!=null) {
			if(temp.data == data) {
				System.out.println(temp.data);
			}
			temp = temp.next;
		}
	}
}
