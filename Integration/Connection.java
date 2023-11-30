package Integration;

import java.util.List;
import java.lang.reflect.Array;

public interface Connection {
    // getter method to retrieve data from backend
    List<Array> getArrayData();

    // setter method to send data to backend
    void sendArrayData(Array arrays);
}