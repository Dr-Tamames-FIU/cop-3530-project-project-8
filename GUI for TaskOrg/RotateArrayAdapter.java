import java.util.List;

// This class will work as an adapter, to implement
// the connection interface created by Angie 

public class RotateArrayAdapter implements Connection {


// We start with the Rotate Array instance that is about to
// be adapt

    private final RotateArray rotateArray;

    // We create our constructor 

    public RotateArrayAdapter(RotateArray rotateArray) {
        this.rotateArray = rotateArray;
    }

    // Implemen the different methods
    // from the connection interface

    @Override
    public List<String> getMostArray() {
        return rotateArray.getMostArray();
    }

    @Override
    public List<String> getMidArray() {
        return rotateArray.getMidArray();
    }

    @Override
    public List<String> getLeastArray() {
        return rotateArray.getLeastArray();
    }

    @Override
    public void addToArray(String arrayLevel, String task) {
        rotateArray.addToArray(arrayLevel, task);
    }

    @Override
    public List<String> shuffleArray(String arrayLevel, int taskAmount) {
        return rotateArray.shuffleArray(rotateArray.getList(arrayLevel.toLowerCase()), taskAmount);
    }


    @Override
    public void emptyArray(String arrayLevel) {
        rotateArray.emptyArray(arrayLevel);
    }

    
}