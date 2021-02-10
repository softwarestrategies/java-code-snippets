package io.softwarestrategies.snippets;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Take list Of numbers and Resort by Odds and Even
 * <p>
 * Coding challenge for one interview:
 * <p>
 * Take this input: { 1, 6, 5, 7,2, 8, 9, 3 }
 * and get this output: { 1,3,5,7,9,2,6,8 }
 */
public class TakeListOfNumbersAndResortByOddsAndEvensTest {

    @Test
    public void testTakeListOfNumbersAndResortByOddsAndEvens() {
        List<Integer> sourceList = Arrays.asList(1, 6, 5, 7, 2, 8, 9, 3);
        List<Integer> expectedList = Arrays.asList(1, 3, 5, 7, 9, 2, 6, 8);

        List<Integer> processedList = processList(sourceList);

        assertTrue(Arrays.equals(expectedList.toArray(), processedList.toArray()));
    }

    private List<Integer> processList(List<Integer> sourceList) {
        List<Integer> sourceElements = Arrays.asList(1, 6, 5, 7, 2, 8, 9, 3);
        Collections.sort(sourceElements);

        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();

        for (Integer sourceElement : sourceElements) {
            if (sourceElement == 1 || (sourceElement % 2 != 0)) {
                odds.add(sourceElement);
            } else {
                evens.add(sourceElement);
            }
        }

        List<Integer> outputList = new ArrayList<>();
        outputList.addAll(odds);
        outputList.addAll(evens);

        return outputList;
    }
}