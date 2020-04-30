package linkedList.circularSingleLL;

public class CircularSingleLL {
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	Node head;
	Node tail;
	public void add(int data) {
		//Node temp = head;
		Node add = new Node(data);
		if(head==null) {
			head = tail = add;
			//add.next = head;
		}
		else {
			tail.next = add;
			tail = add;
			tail.next = head;
		}
	}
	public void search(int data) {
		Node temp = head;
		if(head==null) {
			return;
		}
		do {
			if(temp.data==data) {
				System.out.println(temp.data);
			}temp = temp.next;
		}while(temp!=head);
	}
	public void delete() {
		Node temp = head;
		if(head==null) {
			return;
		}
		else
			do {
				temp = temp.next;
			}while(temp.next.next!=head);
		temp.next = head;
	}
	public void delete(int data) {
		Node temp = head;
		if(head==null) {
			return;
		}else 
			do {
				if(temp.next.data == data) {
					temp.next = temp.next.next;
				}
				temp = temp.next;
			}while(temp!=head);
	}
	public void print() {
		Node temp = head;
		if(head==null) {
			return;
		}
		else
		do{
			
			System.out.println(temp.data);
			temp = temp.next;
			
		}while(temp!=head);
	}
}
