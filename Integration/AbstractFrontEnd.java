package Integration;

import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

public abstract class AbstractFrontEnd extends ListView<User> implements  {
   public void displayData() {
    NewList<User> userData = getUserData();
    getArrays().setAll(userData);
   } 

   public void addUser(String name) {
    User newUser = new User(name);
    sendUserData(newUser);
    System.out.println("Hello, " + newUser);
    displayUserData();
   }

}
