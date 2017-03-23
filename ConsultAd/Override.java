
package ConsultAd;

class Override extends Animal {
	public void show() {
		System.out.println("Birds Eat");
	}

public static void main (String args[]) {
	Override obj1 = new Override();
	obj1.show();
	
}
}
