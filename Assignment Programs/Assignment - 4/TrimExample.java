package nameof;

class TrimExample {
    public static void main(String[] args) {

        String str = "   Hello Java   ";

        String result = str.trim();

        System.out.println("Original String: " + str);
        System.out.println("After trim(): " + result);
    }
}