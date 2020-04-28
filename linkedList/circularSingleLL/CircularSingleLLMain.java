package linkedList.circularSingleLL;

public class CircularSingleLLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularSingleLL add = new CircularSingleLL();
		add.add(3);
		add.add(6);
		add.add(4);
		add.add(8);
		add.add(9);
		add.add(0);
		add.delete(8);
		add.print();
		add.search(0);
	}

}
