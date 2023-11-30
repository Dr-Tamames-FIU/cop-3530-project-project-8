package Integration;

import java.util.LinkedList;
import java.util.List;
import java.lang.reflect.Array;

public class LinkedListBackend implements Connection {

    private List<Array> arrayData;

    public LinkedListBackend() {
        this.arrayData = new LinkedList<>();
        // add data
    }

    @Override
    public List<Array> getArrayData() {
        return new LinkedList<>(arrayData);
    }

    @Override
    public void sendArrayData(Array array) {
        arrayData.add(array);
    }
}