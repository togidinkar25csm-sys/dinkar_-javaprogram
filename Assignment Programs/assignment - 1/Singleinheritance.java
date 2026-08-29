package task2;

class bill{
	void sat() {
		int x = 20,y= 40;
		System.out.println("add from first:"+(x+y));
	}
}

class will extends bill  {
	int z=30;
	void dil()
	
	{
	System.out.println("mul from subclass:"+(z*2));
	}
}

public class Singleinheritance {
	
	public static void main(String[]args) { 
		 will a = new will();
		 a.sat();
		 a.dil();
		 
		
		
		
	}

}
