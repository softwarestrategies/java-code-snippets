package io.softwarestrategies.snippets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test whether a string is a palindrome or not
 */
public class StringIsPalindromeTest {

    @Test
    public void testStringIsPalindrome_True() {
        assertTrue(isPalindrome("abcba"));
    }

    @Test
    public void testStringIsPalindrome_False() {
        assertFalse(isPalindrome("abcde"));
    }

    private boolean isPalindrome(String word) {
        int iterations = word.length() / 2;
        int length = word.length();
        for (int count = 0; count < iterations; count++) {
            if (word.charAt(count) != word.charAt(length - 1 - count)) {
                return false;
            }
        }
        return true;
    }
}