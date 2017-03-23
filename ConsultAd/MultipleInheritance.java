package ConsultAd;

interface Movable {
	 void show(int a);
}

interface Runnable {
	 void show(String s);
}

public class MultipleInheritance implements Movable,Runnable{
	

	public void show(int a) {
	System.out.println("Movable Interface");
}
	public void show(String s) {
	System.out.println("Runnable Interface");
}

	public static void main(String[] args) {
		MultipleInheritance mh1 = new MultipleInheritance();
		mh1.show(100);
		mh1.show("Mutiple Inheritance");

	}
	
}
