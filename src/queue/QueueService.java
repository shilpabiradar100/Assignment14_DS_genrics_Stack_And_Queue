package queue;
import linkedlist.LinkedListService;
public class QueueService<T extends  Comparable <T>>{
    LinkedListService<T> linkedList = new LinkedListService<T>();
    //enqueue internally call append method in linked list.It adds elements at rear of the queue
    public void enQueue(T data)
    {
        linkedList.append(data);
    }
    //Method to delete front element from the queue
    public void deQueue()
    {
        linkedList.pop();
    }
    //method to print the queue
    public void print()
    {
        linkedList.display();
    }
}
