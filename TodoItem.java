/**
 * Class representing a single todo item.
 *
 */
public class TodoItem{

    String name;
    boolean isDone;

    public TodoItem(String name){

        this.name = name;
    }

    public String getName(){

        return this.name;
    }

    public boolean getIsDone(){
        this.isDone = isDone;
        return isDone;
    }

    public void setIsDone(){

        this.isDone = true;
    }

    public void displayInfo(){

        System.out.println(this.name);

        System.out.println(this.isDone);
    }

}
