/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package unit14_randomdice;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tgibbons
 */
public class Unit14_RandomDiceTest {
    
    public Unit14_RandomDiceTest() {
    }

    /**
     * Test of main method, of class Unit14_RandomDice.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Unit14_RandomDice.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillArrayWithRandomValues method, of class Unit14_RandomDice.
     */
    @Test
    public void testFillArrayWithRandomValues() {
        System.out.println("fillArrayWithRandomValues");
        int[] array = null;
        int numSides = 0;
        Unit14_RandomDice.fillArrayWithRandomValues(array, numSides);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printArrayValues method, of class Unit14_RandomDice.
     */
    @Test
    public void testPrintArrayValues() {
        System.out.println("printArrayValues");
        int[] array = null;
        Unit14_RandomDice.printArrayValues(array);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateSum method, of class Unit14_RandomDice.
     */
    @Test
    public void testCalculateSum() {
        System.out.println("calculateSum");
        int[] array = null;
        int expResult = 0;
        int result = Unit14_RandomDice.calculateSum(array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findHighestValue method, of class Unit14_RandomDice.
     */
    @Test
    public void testFindHighestValue() {
        System.out.println("findHighestValue");
        int[] array = null;
        int expResult = 0;
        int result = Unit14_RandomDice.findHighestValue(array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
