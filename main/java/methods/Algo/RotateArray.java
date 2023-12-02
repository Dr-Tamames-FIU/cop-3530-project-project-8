// Noahs class file for the main algo 

//package alog; // might not need

//test
//random import 
// array import 
import java.util.Random;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {
    public List<String> most = new ArrayList<>();
    public List<String> mid = new ArrayList<>();
    public List<String> least = new ArrayList<>();

    public void setMostArray() {
        this.most = most;
    }

    public void setMidArray() {
        this.mid = mid;
    }

    public void setLeastArray() {
        this.least = least;
    }

    // Way to read the stored data
    public List<String> getMostArray() {
        return most;
    }

    public List<String> getMidArray() {
        return mid;
    }

    public List<String> getLeastArray() {
        return least;
    }

    public List<String> emptyArray(String arrayLevel) {
        List<String> arrayToEmpty = null; // list to replace the current one

        // gets the coroect list
        if (arrayLevel.equalsIgnoreCase("most")) {
            arrayToEmpty = most;
        } else if (arrayLevel.equalsIgnoreCase("mid")) {
            arrayToEmpty = mid;
        } else if (arrayLevel.equalsIgnoreCase("least")) {
            arrayToEmpty = least;
        } else {
            System.out.println("Invalid array category, enter \n most \n mid \n or least\n");
        }

        if (arrayToEmpty != null) {
            arrayToEmpty.clear(); // Clear the list
            System.out.println(arrayLevel + " list has been emptied.");
        }

        return arrayToEmpty; // Return the emptied list or null if the arrayLevel is invalid
    }

    public void addToArray(String arrayLevel, String task) {
        // arrayLevel is a string input, options: "Most", "Mid" or "Least"
        // task is the 'task'/element to be added to the specified arrayLevel

        if (arrayLevel.toLowerCase().equals("most"))// string compare usign boolean whilst lowercase convert input
        {
            this.most.add(task);
            // successful add
            System.out.println(task + " Added to : " + arrayLevel + " important array ");
        } else if (arrayLevel.toLowerCase().equals("mid")) {
            this.mid.add(task);
            // successful add
            System.out.println(task + " Added to : " + arrayLevel + " important array ");
        } else if (arrayLevel.toLowerCase().equals("least")) {
            this.least.add(task);
            // successful add
            System.out.println(task + " Added to : " + arrayLevel + " important array ");
        } else // invalid arrayLevel
        {
            System.out.println("arrayLevel is an invalid array category, enter \n most \n mid \n or least \n");
        }

    } // end of addToArray

    public List<String> shuffleArray(List<String> inputList, int amountTask) // shuffles the array, returns strings
    {
        // randomly swaps the index value of an element by randomly genrating an
        // indexwith another array element

        Random rand = new Random(); // creates object from Random class

        for (int i = 0; i < inputList.size(); i++) // swaps every index val for each element in the array
        {
            // gets the radnom index val within the bounds our of input array
            int randomIndexToSwap = rand.nextInt(inputList.size());

            // swapping
            String temp = inputList.get(randomIndexToSwap); // holds the value from the random index in a temporary
                                                            // variable
            inputList.set(randomIndexToSwap, inputList.get(i)); // sets the task at the current index to the random
                                                                // index position
            inputList.set(i, temp); // current value index is reassigned to the random value
        }

        int endIndex = Math.min(amountTask, inputList.size()); // incase user wants the list length to be returned is
                                                               // greater than the list, we get the min val

        // System.out.println("Most important Task" + );
        return inputList.subList(0, endIndex); // CHECK

    } // end of shuffleArray
}// end of class