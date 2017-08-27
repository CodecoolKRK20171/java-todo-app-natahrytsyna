import java.util.*;
public class TodoList{

    private List<TodoItem> items = new ArrayList<>();

    public TodoList(){

        this.items = items;
    }

    public void addToList(String name){

        this.items.add(new TodoItem(name));

    }

    public List<TodoItem>getList(){

        return this.items;
    }

    public void removeItem(TodoItem item){

        this.items.remove(item);
    }
}
