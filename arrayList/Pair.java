package arrayList;

public class Pair<X , Y> {
	X x;
	Y y;
	public Pair(Y y,X x){
		this.x=x;
		this.y = y;
	}
	void GetDescription() {
		System.out.println(y+" "+x);
	}
	
}
