package Stack;
import linkedlist.LinkedListService;
public class StackService<T extends Comparable<T>> {
    LinkedListService<T> linkedList = new LinkedListService<T>();
    //push internally call add method in the linked list
    public void push(T data)
    {
        linkedList.add(data);
    }
    //Method to delete first element in the stack
    public void pop()
    {
        linkedList.pop();
    }
    //method to get top element from the stack
    public void peak()
    {
        System.out.println("top element is: " +linkedList.head.data);
    }
    //Method to print the stack
    public void print()
    {
        linkedList.display();
    }
}
