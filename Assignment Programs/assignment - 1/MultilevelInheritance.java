package task2;

class parent{
	int x = 20;
	
	
	void addition() {
		System.out.println("add is :" +(x+200));
		System.out.println("this is from  superclass");
	}
	
}
class child extends parent {
	int y=1000;
	void mul() {
		System.out.println("add is :" +(y*200));
	}
}



public class MultilevelInheritance extends child {

	
	public static void main(String[]args ) {
		child ch = new child();
		ch.addition();
		ch.mul();
		
	}
	
	

}
