package linkedList.singleLinkedList;

public class SingleLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList add = new SingleLinkedList();
		add.add(12);
		add.add(34);
		add.add(72);
		add.add(89);
		add.add(15);
		add.add(18);
		add.delete(72);
		add.print();
		add.search(34);
		
	}

}
