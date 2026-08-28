
package inheritance;

public class ThrowsThrow {

    public static void validateAge(int age) throws Exception {

        if (age < 18) {
            throw new Exception("Access denied: you must be at least 18 years");
        }

        System.out.println("Access granted: welcome to the system!");
    }

    public static void main(String[] args) {

        try {
            validateAge(12);
        }
        catch (Exception e) {
            System.out.println("Caught an error in main: " + e.getMessage());
        }

        System.out.println("The program continues to run safely....");
    }
}

