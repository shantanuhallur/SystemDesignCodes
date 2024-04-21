import java.util.Stack;

public class CareTaker {
    private Stack<EditorMemento> his = new Stack<>();
    //can be implemented through Arraylist if we want a specific index memento
    //Also can me implemented through Hashmap if we want a specific index corresponding
    //to a specific property like timpestamp.
    public void save(EditorMemento m) {
        his.push(m); 
    }

    public EditorMemento undo() {
        return his.pop();
    }
}
