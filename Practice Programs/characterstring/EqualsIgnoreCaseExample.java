package nameof;

class EqualsIgnoreCaseExample {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "JAVA";

        boolean result = str1.equalsIgnoreCase(str2);

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Strings are equal: " + result);
    }
}