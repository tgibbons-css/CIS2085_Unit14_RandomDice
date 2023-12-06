package unit14_randomdice;

import org.junit.Test;
import static org.junit.Assert.*;

public class Unit14_RandomDiceTest {

    /** =========================================================
     *  Test fillArrayWithRandomValues() method
     ** =========================================================
     */

    @Test
    public void testFillArrayWithRandomValuesWithPositiveNumSides() {
        // Arrange
        int[] array = new int[1000];
        int numSides = 10;

        // Act
        Unit14_RandomDice.fillArrayWithRandomValues(array, numSides);

        // Assert
        for (int value : array) {
            assertTrue(value >= 1 && value <= numSides);
        }
    }

    @Test
    public void testFillArrayWithRandomValuesWithOneNumSides() {
        // Arrange
        int[] array = new int[5];
        int numSides = 1;

        // Act
        Unit14_RandomDice.fillArrayWithRandomValues(array, numSides);

        // Assert
        for (int value : array) {
            assertEquals(numSides, value);
        }
    }

    @Test
    public void testFillArrayWithRandomValuesWithSingleElement() {
        // Arrange
        int[] array = new int[1];
        int numSides = 6;

        // Act
        Unit14_RandomDice.fillArrayWithRandomValues(array, numSides);

        // Assert
        assertTrue(array[0] >= 1 && array[0] <= numSides);
    }

    @Test
    public void testFillArrayWithRandomValuesWithLargeNumSides() {
        // Arrange
        int[] array = new int[10];
        int numSides = 1000;

        // Act
        Unit14_RandomDice.fillArrayWithRandomValues(array, numSides);

        // Assert
        for (int value : array) {
            assertTrue(value >= 1 && value <= numSides);
        }
    }

    /** =========================================================
     *  Test calculateSum() method
     ** =========================================================
     */

    @Test
    public void testCalculateSumWithPositiveValues() {
        // Arrange
        int[] diceValues = {3, 5, 2, 4, 1};
        int expectedSum = 15;

        // Act
        int actualSum = Unit14_RandomDice.calculateSum(diceValues);

        // Assert
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testCalculateSumWithNegativeValues() {
        // Arrange
        int[] diceValues = {-2, -4, -1, -5};
        int expectedSum = -12;

        // Act
        int actualSum = Unit14_RandomDice.calculateSum(diceValues);

        // Assert
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testCalculateSumWithZeroValues() {
        // Arrange
        int[] diceValues = {0, 0, 0, 0};
        int expectedSum = 0;

        // Act
        int actualSum = Unit14_RandomDice.calculateSum(diceValues);

        // Assert
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testCalculateSumWithSingleValue() {
        // Arrange
        int[] diceValues = {7};
        int expectedSum = 7;

        // Act
        int actualSum = Unit14_RandomDice.calculateSum(diceValues);

        // Assert
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testCalculateSumWithEmptyArray() {
        // Arrange
        int[] diceValues = {};
        int expectedSum = 0;

        // Act
        int actualSum = Unit14_RandomDice.calculateSum(diceValues);

        // Assert
        assertEquals(expectedSum, actualSum);
    }

    /** =========================================================
     *  Test findHighestValue() method
     ** =========================================================
     */

    @Test
    public void testFindHighestValueWithPostionOne() {
        // Arrange
        int[] diceValues = {5, 3, 2, 4, 1};
        int expectedHighest = 5;

        // Act
        int actualHighest = Unit14_RandomDice.findHighestValue(diceValues);

        // Assert
        assertEquals(expectedHighest, actualHighest);
    }
    
    @Test
    public void testFindHighestValueWithPostionTwo() {
        // Arrange
        int[] diceValues = {3, 5, 2, 4, 1};
        int expectedHighest = 5;

        // Act
        int actualHighest = Unit14_RandomDice.findHighestValue(diceValues);

        // Assert
        assertEquals(expectedHighest, actualHighest);
    }
    
    @Test
    public void testFindHighestValueWithPostionThree() {
        // Arrange
        int[] diceValues = {3, 2, 5, 4, 1};
        int expectedHighest = 5;

        // Act
        int actualHighest = Unit14_RandomDice.findHighestValue(diceValues);

        // Assert
        assertEquals(expectedHighest, actualHighest);
    }    
    
    @Test
    public void testFindHighestValueWithPostionFour() {
        // Arrange
        int[] diceValues = {3, 4, 2, 5, 1};
        int expectedHighest = 5;

        // Act
        int actualHighest = Unit14_RandomDice.findHighestValue(diceValues);

        // Assert
        assertEquals(expectedHighest, actualHighest);
    }    

    @Test
    public void testFindHighestValueWithPostionFive() {
        // Arrange
        int[] diceValues = {3, 4, 2, 1, 5};
        int expectedHighest = 5;

        // Act
        int actualHighest = Unit14_RandomDice.findHighestValue(diceValues);

        // Assert
        assertEquals(expectedHighest, actualHighest);
    }
    
    @Test
    public void testFindHighestValueWithNegativeValues() {
        // Arrange
        int[] diceValues = {-2, -4, -1, -5};
        int expectedHighest = -1;

        // Act
        int actualHighest = Unit14_RandomDice.findHighestValue(diceValues);

        // Assert
        assertEquals(expectedHighest, actualHighest);
    }

    @Test
    public void testFindHighestValueWithZeroValues() {
        // Arrange
        int[] diceValues = {0, 0, 0, 0};
        int expectedHighest = 0;

        // Act
        int actualHighest = Unit14_RandomDice.findHighestValue(diceValues);

        // Assert
        assertEquals(expectedHighest, actualHighest);
    }
}
