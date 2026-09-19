package nameof;

class ConcatExample {
    public static void main(String[] args) {

        String str1 = "Hello ";
        String str2 = "Java";

        String result = str1.concat(str2);

        System.out.println("First String: " + str1);
        System.out.println("Second String: " + str2);
        System.out.println("Combined String: " + result);
    }
}