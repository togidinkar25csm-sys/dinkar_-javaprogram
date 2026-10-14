package crits;

import java.util.*;

public class ValidParentheses {

    // Map: closing bracket -> matching opening bracket
    static final Map<Character, Character> PAIRS = new HashMap<>();
    static {
        PAIRS.put(')', '(');
        PAIRS.put('}', '{');
        PAIRS.put(']', '[');
    }

    // Set: all opening brackets
    static final Set<Character> OPENING = new HashSet<>(PAIRS.values());

    static boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<>(); // LinkedList used as a stack
        for (char ch : s.toCharArray()) {
            if (OPENING.contains(ch)) {
                stack.push(ch);                           // open bracket -> push
            } else if (PAIRS.containsKey(ch)) {
                if (stack.isEmpty() || !stack.pop().equals(PAIRS.get(ch))) {
                    return false;                         // wrong type or wrong order
                }
            } else {
                return false;                             // not a bracket character
            }
        }
        return stack.isEmpty();                           // empty stack -> all matched
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter brackets: ");
        String input = sc.nextLine().replaceAll("\\s+", ""); // ignore spaces
        System.out.println(isValid(input) ? "Output: valid" : "Output: Not valid");
        sc.close();
    }
}