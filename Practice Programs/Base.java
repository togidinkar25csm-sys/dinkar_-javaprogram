package inheritance;

abstract public class Base {

    int x = 10;

    void sayMyName() {
    	 System.out.println("My name is T dinkar");
    }
    

    abstract void sayMyAge();
}


 class Range extends Base {

     
    public void sayMyAge() {
        System.out.println("My age in subclass is: 19");
    }

    
    public static void main(String[] args) {

    	 Range ad = new   Range();

        System.out.println("Value of x: " + ad.x);
        ad.sayMyName();
        ad.sayMyAge();
    }
}
