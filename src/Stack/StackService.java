package Stack;
import Stack.LinkedListService;;
public class StackService<T extends Comparable<T>> {
    LinkedListService<T> linkedList = new LinkedListService<T>();
    public void push(T data)
    {
        linkedList.add(data);
    }
    public void print()
    {
        linkedList.display();
    }
}
