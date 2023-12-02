import java.util.List;

public interface Connection {
    // this method is used to retrieve data from the back end
    List<String> getMostArray();

    List<String> getMidArray();

    List<String> getLeastArray();

    // this method is used to send user data to thr back end
    void addToArray(String arrayLevel, String task);

    // this method is used to shuffles the array
    List<String> shuffleArray(String arrayLevel, int taskAmount);

    // this method is uses to empty the array
    void emptyArray(String arrayLevel);
}