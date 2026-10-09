package myprog;

class As {

    void add() {
        int x = 10;
        System.out.println("Superclass is: " + (x + 20));
    }
}

class Bs extends As {

    int y = 30;

    
    Bs() {
        super();   
    }

    void sub() {
        System.out.println("Subclass is: " + (y - 20));
    }

    @Override
    void add() {
        int l = 10, r = 20;
        System.out.println("Subclass is: " + (l + r + 200));
    }

    void displaySuper() {
        super.add();  
    }
}

public class Din {
    public static void main(String[] args) {

        Bs obj = new Bs();

        obj.sub();          
        obj.add();          
        obj.displaySuper();
    }
}