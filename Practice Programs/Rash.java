package myprog;

class Ds {
    int x = 20;

    void add() {
        System.out.println("Superclass: " + (x + 20));
    }
}

class Ps extends Ds {
    int y = 30;

    void sub() {
        System.out.println("Subclass: " + (y - 20));
    }

    
    @Override
    void add() {
        int l = 30, o = 40;
        System.out.println("Subclass: " + (l * o + 20));
    }
}

class Rs extends Ps {
    int d = 10;
    int a;

    void mul() {
        System.out.println("Subclass: " + (d * 20));
    }

    @Override
    void sub() {
        a = 10;
        System.out.println("Subclass: " + (20 - a));
    }
}

class Vs extends Rs {
    int b = 20;

    void div() {
        System.out.println("Subclass: " + (b / 20));
    }

    @Override
    void mul() {
        d = 50;
        System.out.println("Subclass: " + (d * 20));
    }
}

class Zs extends Rs {
    int v = 40;

    @Override
    void mul() {
        System.out.println("Subclass: " + (v * 20));
    }
}

public class Rash {

    public static void main(String[] args) {

        
        Ds obj1 = new Ds();
        obj1.add();

        
        Ps obj2 = new Ps();
        obj2.add();
        obj2.sub();

       
        Rs obj3 = new Rs();
        obj3.add();
        obj3.sub();
        obj3.mul();

        
        Vs obj4 = new Vs();
        obj4.add();
        obj4.sub();
        obj4.mul();
        obj4.div();

     
        Zs obj5 = new Zs();
        obj5.add();
        obj5.sub();
        obj5.mul();
    }
}