package unit14_randomdice;

import java.util.Random;
import java.util.Scanner;

public class Unit14_RandomDice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for the number of dice and sides on each die
        System.out.print("Enter the number of dice: ");
        int numDice = input.nextInt();

        System.out.print("Enter the number of sides on each die: ");
        int numSides = input.nextInt();

        // Step 1: Declare an array to hold the dice values.
        int[] diceRolls = new int[numDice];

        // Step 2: Fill each element in the array with a random number between 1 and the number of sides.
        fillArrayWithRandomValues(diceRolls, numSides);

        // Step 3: Print out all the dice values.
        System.out.print("Dice values: ");
        printArrayValues(diceRolls);
        
        // Step 4: Calculate the sum of the dice.
        int sum = calculateSum(diceRolls);
        System.out.println("Sum of the dice: " + sum);

        // Step 5: Find the highest value. 
        int highestValue = findHighestValue(diceRolls);
        System.out.println("The highest value is: " + highestValue);
    }

    // Method to fill the array with random values between 1 and the number of sides.
    public static void fillArrayWithRandomValues(int[] array, int numSides) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(numSides);
        }
    }

    // Method to print the values in the array.
    public static void printArrayValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();  // Move to the next line for better readability.
    }

    // Method to calculate the sum of the dice values.
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    
    // Method to find the highest value in the array.
    public static int findHighestValue(int[] array) {
        int highest = array[1];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > highest) {
                highest = array[i];
            }
        }
        return highest;
    }
    
    
}

   