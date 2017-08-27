import java.util.Scanner;
import java.util.*;


public class App{

    private static Scanner sc;
    private static String name;
    private static String doneOrNot;
    private static boolean isDone=false;
    private static TodoItem item;
    private static Integer choice;
    private static App app = new App();
    private static TodoList list = new TodoList();
    private static List <TodoItem> itemsList;
    private static int index;

    public static void main(String[] args) {


        while(true){
            UI.printIntro();
            choice = UI.getChoice();

            if(choice == 0){
                app.addItem();
            }
            else if(choice == 1){
                app.listItems();

            }
            else if(choice == 2){
                app.markItem();
            }

            else if(choice == 3){
                app.removeItem();
            }

        }


    }

    private List<TodoItem> addItem(){

        this.list = list;
        name = UI.askName();
        this.list.addToList(name);
        return list.getList();

    }


    private void listItems(){

        this.itemsList = this.list.getList();

        for (TodoItem el: this.itemsList){

            el.displayInfo();
        }

    }

    private void markItem(){

        this.itemsList = this.list.getList();
        app.listItems();
        choice = UI.getChoice();
        index = app.getIndex(choice);
        item = this.itemsList.get(index);
        item.setIsDone();

    }

    private int getIndex(Integer choice){

        int a = 0;
        for (TodoItem el: this.itemsList){

            if (this.itemsList.indexOf(el) == choice-1){
                a = this.itemsList.indexOf(el);

            }
            else{
                System.out.println("No such element!");;
            }
        }
        return a;
    }

    private void removeItem(){

        app.listItems();
        this.itemsList = this.list.getList();

        choice = UI.getChoice();
        index = app.getIndex(choice);
        item = this.itemsList.get(index);
        this.list.removeItem(item);

    }
}
