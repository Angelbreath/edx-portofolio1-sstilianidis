import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class aList {


    List<Task> myList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public void AddToList() {
        Task task = new Task();
        System.out.println("Enter a new task: ");
        task.setTaskDesc(scanner.nextLine());
        myList.add(task);
        System.out.println("New item " + task.getTaskDesc() + " is added in your list!");
    }

    //Print the list with numbers
    public void PrintList() {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(i + 1 + "." + myList.get(i));
        }
    }

}