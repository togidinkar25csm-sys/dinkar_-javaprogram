package nameof;

class EndsWithExample {
    public static void main(String[] args) {

        String str = "Java Programming";

        boolean result = str.endsWith("Programming");

        System.out.println("String: " + str);
        System.out.println("Ends with Programming: " + result);
    }
}