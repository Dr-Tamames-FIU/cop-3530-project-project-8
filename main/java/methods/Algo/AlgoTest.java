// Used to test AlgoNP File 

//package alog;//might not need

//import main/java/methods/Algo/AlgoNP; // releavtive path to algoritm
//test
import java.util.ArrayList;
public class AlgoTest
{
    public static void main(String[] args) //main
    {
        System.out.println("\nTEST\n");

        RotateArray RotateArrayobj = new RotateArray(); //object from RotateArray class 

        // different catagories for arrays & items
        RotateArrayobj.addToArray("most", "HW");
        RotateArrayobj.addToArray("MOST", "exams");

        RotateArrayobj.addToArray("mid", "shop");
        RotateArrayobj.addToArray("MID", "clean");

        RotateArrayobj.addToArray("least", "toilet");
        RotateArrayobj.addToArray("LEAST", "shave");

        RotateArrayobj.addToArray("DJWJ", "poop");

        // Above works

        // Shuffling and printing results
        System.out.println("Shuffled Most: " + RotateArrayobj.shuffleArray(RotateArrayobj.getMostArray(), 2));

        System.out.println("Shuffled Mid: " + RotateArrayobj.shuffleArray(RotateArrayobj.getMidArray(), 2));

        System.out.println("Shuffled Least: " + RotateArrayobj.shuffleArray(RotateArrayobj.getLeastArray(), 2));
        
        
        // RotateArrayobj.shuffleArray(RotateArrayobj.getMostArray(), 2);

        // RotateArrayobj.shuffleArray(RotateArrayobj.getMidArray(), 2);

        // RotateArrayobj.shuffleArray(RotateArrayobj.getLeastArray(), 2);

        //display the lists for each
        RotateArrayobj.getMostArray();
        RotateArrayobj.getMidArray();
        RotateArrayobj.getLeastArray();

        RotateArrayobj.emptyArray("most");
        RotateArrayobj.emptyArray("mid");
        RotateArrayobj.emptyArray("least");

        
        RotateArrayobj.addToArray("most", "HW");
        RotateArrayobj.addToArray("MOST", "exams");

        RotateArrayobj.addToArray("mid", "shop");
        RotateArrayobj.addToArray("MID", "clean");

        RotateArrayobj.addToArray("least", "toilet");
        RotateArrayobj.addToArray("LEAST", "shave");

        RotateArrayobj.addToArray("DJWJ", "poop");

        // Above works

        // Shuffling and printing results
        System.out.println("Shuffled Most: " + RotateArrayobj.shuffleArray(RotateArrayobj.getMostArray(), 2));

        System.out.println("Shuffled Mid: " + RotateArrayobj.shuffleArray(RotateArrayobj.getMidArray(), 2));

        System.out.println("Shuffled Least: " + RotateArrayobj.shuffleArray(RotateArrayobj.getLeastArray(), 2));
    }

} //end of main class 