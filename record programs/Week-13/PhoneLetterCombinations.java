package crits;

import java.util.*;

public class PhoneLetterCombinations {

    // Map (Collections Framework): digit -> letters on the telephone keypad
    static final Map<Character, String> KEYPAD = new HashMap<>();

    static {
        KEYPAD.put('2', "abc");
        KEYPAD.put('3', "def");
        KEYPAD.put('4', "ghi");
        KEYPAD.put('5', "jkl");
        KEYPAD.put('6', "mno");
        KEYPAD.put('7', "pqrs");
        KEYPAD.put('8', "tuv");
        KEYPAD.put('9', "wxyz");
    }

    // Returns all letter combinations of the given digit string
    static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();      // List interface
        if (digits.isEmpty()) {
            return result;
        }

        Queue<String> queue = new LinkedList<>();     // Queue interface
        queue.add("");                                // start with empty prefix

        for (char d : digits.toCharArray()) {
            String letters = KEYPAD.get(d);
            int size = queue.size();                  // combinations built so far
            for (int i = 0; i < size; i++) {
                String prefix = queue.remove();       // take from the front
                for (char ch : letters.toCharArray()) {
                    queue.add(prefix + ch);           // add to the back
                }
            }
        }

        result.addAll(queue);
        return result;
    }

    // Checks that every character is a digit from 2 to 9
    static boolean isValid(String digits) {
        Set<Character> allowed = KEYPAD.keySet();     // Set interface
        for (char d : digits.toCharArray()) {
            if (!allowed.contains(d)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digits (2-9): ");
        String digits = sc.nextLine().trim();

        if (!isValid(digits)) {
            System.out.println("Invalid input. Use digits from 2 to 9 only.");
        } else {
            List<String> combos = letterCombinations(digits);
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < combos.size(); i++) {
                sb.append("\"").append(combos.get(i)).append("\"");
                if (i < combos.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            System.out.println("Output: " + sb);
            System.out.println("Total combinations: " + combos.size());
        }
        sc.close();
    }
}