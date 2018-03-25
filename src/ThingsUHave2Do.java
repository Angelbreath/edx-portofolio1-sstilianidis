import java.util.ArrayList;
import java.util.Scanner;


public class ThingsUHave2Do {
    public static void main(String[] args) {

        List myList = new List();


        Scanner scanner = new Scanner(System.in);
        int toDo = 1;


        while (toDo != 3) {
            System.out.println("Enter 1 for create a task, 2 to print your list, 3 to exit.");
            toDo = scanner.nextInt();
            if (toDo == 1) {
                myList.AddToList();

            }
            if (toDo == 2) {
                System.out.println(myList.myList);
            }


        }


    }
}