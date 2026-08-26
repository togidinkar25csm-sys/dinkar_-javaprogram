package task1;

import java.util.Scanner;

public class StudentUtilityProgram {

    // ---------- Part D : Methods ----------

    // Factorial Method
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // Prime Method
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Maximum Method
    public static int maximum(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    // Area of Circle Method
    public static double areaOfCircle(double r) {
        return 3.14159 * r * r;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n========== STUDENT UTILITY PROGRAM ==========");
            System.out.println("1. Student Information");
            System.out.println("2. Even or Odd");
            System.out.println("3. Largest of Three Numbers");
            System.out.println("4. Grade Calculation");
            System.out.println("5. Day of Week");
            System.out.println("6. Multiplication Table");
            System.out.println("7. Numbers from 1 to N");
            System.out.println("8. Sum of First N Natural Numbers");
            System.out.println("9. Fibonacci Series");
            System.out.println("10. Factorial");
            System.out.println("11. Prime Number");
            System.out.println("12. Maximum of Two Numbers");
            System.out.println("13. Area of Circle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

            // ---------- Part A ----------
            case 1:

                sc.nextLine();

                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Roll Number: ");
                String roll = sc.nextLine();

                System.out.print("Enter Marks in Subject 1: ");
                int m1 = sc.nextInt();

                System.out.print("Enter Marks in Subject 2: ");
                int m2 = sc.nextInt();

                System.out.print("Enter Marks in Subject 3: ");
                int m3 = sc.nextInt();

                int total = m1 + m2 + m3;
                double percentage = total / 3.0;

                System.out.println("\n----- Student Details -----");
                System.out.println("Student Name : " + name);
                System.out.println("Roll Number  : " + roll);
                System.out.println("Total Marks  : " + total);
                System.out.printf("Percentage   : %.2f%%\n", percentage);

                break;

            // ---------- Part B ----------
            case 2:

                System.out.print("Enter a Number: ");
                int num = sc.nextInt();

                if (num % 2 == 0)
                    System.out.println("Even Number");
                else
                    System.out.println("Odd Number");

                break;

            case 3:

                System.out.print("Enter Three Numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                int largest = a;

                if (b > largest)
                    largest = b;

                if (c > largest)
                    largest = c;

                System.out.println("Largest Number = " + largest);

                break;

            case 4:

                System.out.print("Enter Percentage: ");
                double per = sc.nextDouble();

                if (per >= 90)
                    System.out.println("Grade A");
                else if (per >= 75)
                    System.out.println("Grade B");
                else if (per >= 60)
                    System.out.println("Grade C");
                else if (per >= 40)
                    System.out.println("Grade D");
                else
                    System.out.println("Fail");

                break;

            case 5:

                System.out.print("Enter Day Number (1-7): ");
                int day = sc.nextInt();

                switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid Day");
                }

                break;

            // ---------- Part C ----------
            case 6:

                System.out.print("Enter Number: ");
                int table = sc.nextInt();

                for (int i = 1; i <= 10; i++) {
                    System.out.println(table + " x " + i + " = " + (table * i));
                }

                break;

            case 7:

                System.out.print("Enter N: ");
                int n = sc.nextInt();

                for (int i = 1; i <= n; i++) {
                    System.out.print(i + " ");
                }

                System.out.println();

                break;

            case 8:

                System.out.print("Enter N: ");
                int num1 = sc.nextInt();

                int sum = 0;

                for (int i = 1; i <= num1; i++) {
                    sum = sum + i;
                }

                System.out.println("Sum = " + sum);

                break;

            case 9:

                System.out.print("Enter Number of Terms: ");
                int terms = sc.nextInt();

                int first = 0;
                int second = 1;

                System.out.print("Fibonacci Series: ");

                for (int i = 1; i <= terms; i++) {
                    System.out.print(first + " ");
                    int next = first + second;
                    first = second;
                    second = next;
                }

                System.out.println();

                break;

            // ---------- Part D ----------
            case 10:

                System.out.print("Enter Number: ");
                int factNum = sc.nextInt();

                System.out.println("Factorial = " + factorial(factNum));

                break;

            case 11:

                System.out.print("Enter Number: ");
                int prime = sc.nextInt();

                if (isPrime(prime))
                    System.out.println("Prime Number");
                else
                    System.out.println("Not a Prime Number");

                break;

            case 12:

                System.out.print("Enter Two Numbers: ");
                int x = sc.nextInt();
                int y = sc.nextInt();

                System.out.println("Maximum = " + maximum(x, y));

                break;

            case 13:

                System.out.print("Enter Radius: ");
                double radius = sc.nextDouble();

                System.out.printf("Area of Circle = %.2f\n", areaOfCircle(radius));

                break;

            case 0:

                System.out.println("Program Terminated.");

                break;

            default:

                System.out.println("Invalid Choice!");

            }

        } while (choice != 0);

        sc.close();
    }
}