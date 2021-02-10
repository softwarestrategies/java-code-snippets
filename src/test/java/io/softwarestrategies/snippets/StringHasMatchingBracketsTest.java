package io.softwarestrategies.snippets;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests that a string to see if all opening brackets have matching (in number and type) brackets
 * <p>
 * This was an programming test from an interview
 * <p>
 * A pair of brackets is balanced if each opening bracket is accompanied by a closing bracket.  In the case of nested
 * brackets, the most recently opened bracket must be the first to be closed.
 * <p>
 * The brackets consist of these characters:    (, ), {, } [, ], <, and >
 */
public class StringHasMatchingBracketsTest {

    @Test
    public void testHasBalancedBrackets_True() {
        assertTrue(hasBalancedBrackets("[](){}<>"));
    }

    @Test
    public void testHasBalancedBrackets_False() {
        assertFalse(hasBalancedBrackets("(h[e{lo}!]~)()()()("));
    }

    private boolean hasBalancedBrackets(String stringToCheck) {
        Stack<String> opens = new Stack<String>();
        Stack<String> closes = new Stack<String>();

        for (int count = 0; count < stringToCheck.length(); count++) {
            String character = stringToCheck.substring(count, count + 1);
            if ("(".equals(character) || "{".equals(character) || "[".equals(character) || "<".equals(character)) {
                opens.push(character);
            } else if (")".equals(character) || "}".equals(character) || "]".equals(character) || ">".equals(character)) {
                closes.push(character);
            }
        }

        if (opens.size() != closes.size()) {
            return false;
        }

        for (int count = opens.size() - 1; count > 0; count--) {
            String open = opens.get(count);
            String close = closes.get(count);
            if (open.equals("(") && !close.equals(")")) {
                return false;
            } else if (open.equals("{") && !close.equals("}")) {
                return false;
            } else if (open.equals("[") && !close.equals("]")) {
                return false;
            } else if (open.equals("<") && !close.equals(">")) {
                return false;
            }
        }

        return true;
    }

}