package Integration;

import java.util.Collections
import java.util.LinkedList;
import java.util.List;
import java.lang.reflect.Array;

public class LinkedListBackend implements Connection {

    private List<Array> arrayData;

    // method that stores the arrays from backend into linked list
    public LinkedListBackend() {
        this.arrayData = new LinkedList<>();
        // add data
    }

    @Override
    public List<Array> getArrayData() {
        return new LinkedList<>(arrayData);
    }

    // method that takes what is stored from backend and sends it to front end to be
    // displayed
    @Override
    public void sendArrayData(Array array) {
        arrayData.add(array);

    }
}