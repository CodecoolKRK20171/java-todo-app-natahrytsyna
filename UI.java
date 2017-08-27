import java.util.Scanner;

public class UI{


    public static String askName(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of todo-item: ");
        String name = sc.nextLine();
        return name;

    }

    public static String askIsDone(){

        System.out.println("Enter if it's done('y' or 'no'): ");
        Scanner sc = new Scanner(System.in);
        String isDone = sc.nextLine();
        return isDone;
    }

    public static Integer getChoice(){

        System.out.println("Choose item: ");
        Scanner sc = new Scanner(System.in);
        Integer choice = sc.nextInt();
        return choice;
    }

    public static void printIntro(){

        System.out.println("Choose an action: 0 - Add item   1 - List items  2 - Mark item  3 - Remove item");
    }
}
