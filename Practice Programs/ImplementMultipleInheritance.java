package inheritance;

interface I1{
	int x= 100;
	void sample();
}
interface I2{
	int y = 200;
	void demo();
}

class Multi implements I1, I2 {
	
	@Override
	public void sample() {
		 
			 System.out.println("this is from interface 1");
	    
		}
	
	
	@Override
	public void demo() {
		 System.out.println("this is from interface 2");
    }
	
	void mymethod() {
		 System.out.println("from child class");
    }
	}
	
public class ImplementMultipleInheritance {
	public static void main(String[] args) {
		Multi mlt = new Multi();
		System.out.println(I1.x);
		System.out.println(I2.y);
		mlt.demo();
		mlt.sample();
		mlt.mymethod();

	}
}
