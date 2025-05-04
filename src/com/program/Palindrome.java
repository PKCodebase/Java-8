package com.program;

public class Palindrome {
    /**
     * This method checks if a given string is a palindrome or not.
     * A palindrome is a word, phrase, number, or other sequence of characters
     * that reads the same backward as forward.
     *
     * @param str The input string to be checked for palindrome.
     * @return true if the input string is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(String str) {
        // Initialize two pointers, one at the start and one at the end of the string
        int i = 0;
        int j = str.length() - 1;

        // Iterate until the two pointers meet in the middle
        while (i <= j) {
            // Get the characters at the current positions
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);

            // If the characters are not equal, it's not a palindrome
            if (ch1 != ch2) {
                return false;
            } else {
                // Move the pointers inward
                i++;
                j--;
            }
        }

        // If the loop completes without returning false, it's a palindrome
        return true;
    }
}
