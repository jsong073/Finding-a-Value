/*
This program will do the following:
1. Create an ArrayList of 10 random integers 1-50
2. Prompt the user to look for a value
3. Inform the user if the value is in the ArrayList, and how many times it appears in the list

Process:
1. Initialize variables:
    a. "ArrayList<Integer> randomNumbers" to store the 10 random integers 1-50
    b. "Scanner input" to prompt the user
    c. "int numberToFind" to store the user-input number
    d. "Random random" to generate random numbers
    e. "boolean matchFound" to check whether a number in the list matches numberToFind
    f. "int matchFoundCounter" to store how many times a number in the list matches numberToFind
2. FOR int i = 0 to 10 exclusive
        add a randomly generated number between 1 and 50 to randomNumbers
   ENDFOR
3. Prompt user for a number and set numberToFind equal to that number
4. Go through the randomNumbers ArrayList to see if numberToFind is equal to any number inside the list
    FOR (Integer i : randomNumbers)
        IF i is equal to numberToFind THEN
            set matchFound equal to true
            increment matchFoundCounter
        ELSE
            set matchFound equal to false
        ENDIF
    ENDFOR
5. Print out the corresponding message depending on if a matching number was found or not
    IF matchFound is true THEN
        Print the number of times the number was found
    ELSE
        Tell the user the number was not found
    ENDIF
 */

import java.util.*;

public class ValueSearch {
    public static void main (String[] args) {
        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        int numberToFind = 0;
        Random random = new Random();
        boolean matchFound = false;
        int matchFoundCounter = 0;

        for (int i = 0; i < 10; i++) {
            randomNumbers.add(1 + random.nextInt(50));
        }

        System.out.println(randomNumbers.toString());

        System.out.print("Enter a number to find: ");
        numberToFind = input.nextInt();
        for(Integer i : randomNumbers) {
            if (i == numberToFind) {
                matchFound = true;
                matchFoundCounter++;
            }
        }
        if (matchFound == true) {
            System.out.println(numberToFind + " was found " + matchFoundCounter + " times.");
        } else {
            System.out.println(numberToFind + " was not found.");
        }

        System.out.println("Goodbye.");
    }
}
