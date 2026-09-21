package task1;


import java.util.Scanner;

public class JavaBasics {

    // Method to check Prime Number
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    // Method to check Palindrome
    static boolean isPalindrome(int n) {
        int original = n;
        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Part 1: Command Line Arguments
        System.out.println("===== COMMAND LINE ARGUMENTS =====");

        if (args.length == 0) {
            System.out.println("No command line arguments provided.");
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        }

        // Part 2: Prime Number
        System.out.println("\n===== PRIME NUMBER =====");

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isPrime(number))
            System.out.println(number + " is a Prime Number.");
        else
            System.out.println(number + " is not a Prime Number.");

        // Part 3: Palindrome
        System.out.println("\n===== PALINDROME =====");

        System.out.print("Enter a number: ");
        int palindromeNumber = sc.nextInt();

        if (isPalindrome(palindromeNumber))
            System.out.println(palindromeNumber + " is a Palindrome.");
        else
            System.out.println(palindromeNumber + " is not a Palindrome.");

        sc.close();
    }
}

