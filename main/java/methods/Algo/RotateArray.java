// Noahs class file for the main algo 

package alog; // might not need

//random import 
// array import 
import java.util.Random;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray
{

    // global params 
    // String task = "";
    // constructor 

    // setter global params 

    // getter global params 

    public static void addToArray(String arrayLevel, String task )
    {
        // arrayLevel is a string input, options: "Most", "Mid" or "Least"
        // task is the 'task'/element to be added to the specified arrayLevel

        List<String> most = new ArrayList<>();
        List<String> mid = new ArrayList<>();
        List<String> least = new ArrayList<>();

        if (arrayLevel.toLowerCase().equals(most))// string compare usign boolean whilst lowercase convert input
        {
            most.add(task);
        }
        else if (arrayLevel.toLowerCase().equals(mid))
        {
            mid.add(task);
        }
        else if (arrayLevel.toLowerCase().equals(least))
        {
            least.add(task);
        }
        else // invalid arrayLevel
        { 
        System.out.println("Invalid array category, enter \n most \n mid \n or least");
        }

        // successful add
        System.out.println( task + " Added to : " + arrayLevel + " important array ");

    } // end of addToArray

    public static Array shuffleArray(String [] inputarray, int amountTask) // shuffles the array
    {
        // randomly swaps the index value of an element by randomly genrating an indexwith another array element

        Random rand = new Random(); // creates object from Random class 

        for (int i = 0; i < inputarray.length; i++) // swaps every index val for each element in the array
         {
            //gets the radnom index val within the bounds our of input array
			int randomIndexToSwap = rand.nextInt(inputarray.length);

            //swapping
			int temp = inputarray[randomIndexToSwap]; // holds the value from the random index  in a temporary variable
			inputarray[randomIndexToSwap] = inputarray[i]; // sets the task at the current index to the random index position
			inputarray[i] = temp; // current value index is reassigned to the random value
		}

        return inputarray[:amountTask]; // returns first 3 vals  // CHECK if slice works
    }


    // public static void printArray()
    // {
    //     system.out.println();
    // }

}// end of class 


// Testing 