import java.util.ArrayList;
import java.util.Scanner;


public class List {




    ArrayList<String> myList = new ArrayList<>();






    public void AddToList() {

        Task task = new Task();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create a new task: ");
        task.taskDesc = scanner.nextLine();

        myList.add(task.taskDesc);


        System.out.println("New item " + task.taskDesc + " is added in your list!");
    }
}
