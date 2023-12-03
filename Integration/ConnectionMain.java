public class ConnectionMain {
    public static void main(String[] args) {
        LinkedListAbstract linkedListAbstract = new LinkedListAbstract();

        // Adding tasks to different arrays
        linkedListAbstract.addToArray("most", "Task 1");
        linkedListAbstract.addToArray("most", "Task 2");
        linkedListAbstract.addToArray("mid", "Task 3");
        linkedListAbstract.addToArray("least", "Task 4");

        // Displaying the content of each array
        System.out.println("Most Array: " + linkedListAbstract.getMostArray());
        System.out.println("Mid Array: " + linkedListAbstract.getMidArray());
        System.out.println("Least Array: " + linkedListAbstract.getLeastArray());

        // Shuffling and displaying a subset of each array
        System.out.println("Shuffled Most Array: " + linkedListAbstract.shuffleArray("most", 2));
        System.out.println("Shuffled Mid Array: " + linkedListAbstract.shuffleArray("mid", 1));
        System.out.println("Shuffled Least Array: " + linkedListAbstract.shuffleArray("least", 1));

        // Emptying an array and displaying its content
        linkedListAbstract.emptyArray("mid");
        System.out.println("Mid Array after emptying: " + linkedListAbstract.getMidArray());
    }
}
