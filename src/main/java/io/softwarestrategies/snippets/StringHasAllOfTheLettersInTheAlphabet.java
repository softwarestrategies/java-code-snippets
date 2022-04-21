package io.softwarestrategies.snippets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Tests a string to see if it contains all 26 letters in the alphabet
 * <p>
 * PROBLEM (interview question at DTS):
 * <p>
 * Given a long list of sentences (containing letters from the English alphabet and spaces) determine for each sentence
 * in the list whether it contains all the letters in the alphabet or not.
 * <p>
 * EXPLANATION:
 * <p>
 * Allowed the fact that a Set disallows duplicate entries to do the heavy-lifting.  This parses through the characters
 * of a sentence entered in at the command-line.  If the character is a letter (A-Z), add it to the set.  After all the
 * characters have been processed, if one or more instances of all the characters in the alphabet have occurred, the
 * set's size should be 26.
 */
public class StringHasAllOfTheLettersInTheAlphabet {

    private final static List<String> sentences = Arrays.asList(
            "Here is a dummy sentence.  It is very long and definitely doesn't have the right stuff and thus can be used to test failure even when long enough",
            "There should be a fix way to visit the Santa Cruz zoo just in time for quick viewing of the baboons and koalas and pandas",
            "Just a final sentence to test"
    );


    public static void main(String[] args) {
        StringHasAllOfTheLettersInTheAlphabet app = new StringHasAllOfTheLettersInTheAlphabet();

        // Test True condition
        boolean result = app.sentenceHasAllLetters("There should be a fix way to visit the Santa Cruz zoo just in time for quick viewing of the baboons and koalas and pandas");
        if (result == false) {
            throw new RuntimeException("Result should have been true");
        }

        // Test False condition
        result = app.sentenceHasAllLetters("Here is a dummy sentence.  It is very long and definitely doesn't have the right stuff and thus can be used to test failure even when long enough");
        if (result == true) {
            throw new RuntimeException("Result should have been false");
        }
    }

    private boolean sentenceHasAllLetters(String sentence) {
        Set<Character> charsInSentence = new HashSet<Character>();

        for (int i = 0; i < sentence.length(); i++) {
            Character currCharacter = sentence.toLowerCase().charAt(i);
            if (Character.isAlphabetic(currCharacter)) {
                charsInSentence.add(currCharacter);
            }
        }

        return charsInSentence.size() == 26;
    }
}