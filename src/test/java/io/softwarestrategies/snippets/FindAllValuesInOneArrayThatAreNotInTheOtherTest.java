package io.softwarestrategies.snippets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Find all values in one array which are not present in another
 * <p>
 * Coding challenge for interview:
 * <p>
 * array1 = [a,b,c,d,e,f,g,s,t]
 * array2 = [a,b,b,d,f,g,s,z]
 * <p>
 * answer = [c,e,t]
 */
public class FindAllValuesInOneArrayThatAreNotInTheOtherTest {

    @Test
    public void testFindAllValuesInOneArrayThatAreNotInTheOther() {
        final char[] array1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 's', 't'};
        final char[] array2 = {'a', 'b', 'b', 'd', 'f', 'g', 's', 'z'};

        String charsInFirstArrayThatAreNotInSecond = getCharsInFirstArrayThatAreNotInSecond(array1, array2);

        assertEquals("cet", charsInFirstArrayThatAreNotInSecond);
        System.out.println("Success!!!");
    }

    private String getCharsInFirstArrayThatAreNotInSecond(char[] firstArray, char[] secondArray) {
        String result = "";
        for (char charToCheck : firstArray) {
            if (!charArrayContains(secondArray, charToCheck)) {
                result += charToCheck;
            }
        }
        return result;
    }

    private boolean charArrayContains(char[] theArray, char theChar) {
        for (char possible : theArray) {
            if (possible == theChar)
                return true;
        }
        return false;
    }
}