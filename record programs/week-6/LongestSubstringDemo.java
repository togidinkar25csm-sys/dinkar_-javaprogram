package task1;

import java.util.HashMap;

//Result holder class
class SubstringResult {
 private int length;
 private String substring;

 SubstringResult(int length, String substring) {
     this.length = length;
     this.substring = substring;
 }

 public int getLength() {
     return length;
 }

 public String getSubstring() {
     return substring;
 }

 @Override
 public String toString() {
     return "Length = " + length + ", Substring = \"" + substring + "\"";
 }
}


//Core logic class
class LongestSubstringFinder {
 private HashMap<Character, Integer> charLastIndex = new HashMap<>();

 public SubstringResult findLongestSubstring(String s) {
     charLastIndex.clear();

     int left = 0;
     int maxLength = 0;
     int maxStart = 0;

     for (int right = 0; right < s.length(); right++) {
         char currentChar = s.charAt(right);

         if (charLastIndex.containsKey(currentChar)
                 && charLastIndex.get(currentChar) >= left) {
             left = charLastIndex.get(currentChar) + 1;
         }

         charLastIndex.put(currentChar, right);

         int currentLength = right - left + 1;
         if (currentLength > maxLength) {
             maxLength = currentLength;
             maxStart = left;
         }
     }

     String longestSubstring = s.substring(maxStart, maxStart + maxLength);
     return new SubstringResult(maxLength, longestSubstring);
 }
}


//Main class
public class LongestSubstringDemo {
 public static void main(String[] args) {

     LongestSubstringFinder finder = new LongestSubstringFinder();

     String[] testInputs = {
         "abcabcbb",
         "bbbbb",
         "pwwkew",
         "dvdf",
         "anviaj"
     };

     for (String input : testInputs) {
         SubstringResult result = finder.findLongestSubstring(input);
         System.out.println("Input  : \"" + input + "\"");
         System.out.println("Result : " + result);
         System.out.println("-----------------------------------");
     }
 }
}
