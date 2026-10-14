package crits;

//Shared resource: only one person thread can be inside reserve() at a time
class Reservation {
 private int availableSeats = 10;
 private boolean firstPerson = true;

 // synchronized => only one thread at a time (monitor lock on this object)
 synchronized void reserve(String name, int requested) {
     if (!firstPerson) {
         System.out.println("----------------------------------------------");
     }
     firstPerson = false;

     System.out.println(name + " entered.");
     System.out.println("Available seats: " + availableSeats
             + " Requested seats: " + requested);

     try {
         Thread.sleep(300);          // simulate time taken to book
     } catch (InterruptedException e) {
         System.out.println("Interrupted");
     }

     if (requested <= availableSeats) {
         System.out.println("Seat Available. Reserve now :-)");
         availableSeats -= requested;
         System.out.println(requested + " seats reserved.");
     } else {
         System.out.println("Requested seats not available :-)");
     }
     System.out.println(name + " leaving.");
 }
}

//Each person is a separate thread
class Person extends Thread {
 private Reservation res;
 private int seats;

 Person(String name, Reservation res, int seats) {
     super(name);
     this.res = res;
     this.seats = seats;
 }

 public void run() {
     res.reserve(getName(), seats);
 }
}

public class ReservationSystem {
 public static void main(String[] args) throws InterruptedException {
     Reservation res = new Reservation();

     Person p1 = new Person("Person-1", res, 5);
     Person p2 = new Person("Person-2", res, 2);
     Person p3 = new Person("Person-3", res, 4);

     // Thread priorities (1 = MIN, 5 = NORM, 10 = MAX)
     p1.setPriority(Thread.MAX_PRIORITY);
     p2.setPriority(Thread.NORM_PRIORITY);
     p3.setPriority(Thread.MIN_PRIORITY);

     p1.start();
     Thread.sleep(200);
     p2.start();
     Thread.sleep(200);
     p3.start();

     p1.join();
     p2.join();
     p3.join();
 }
}