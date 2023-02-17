package queue;
import linkedlist.LinkedListService;
public class QueueService<T extends  Comparable <T>>{
    LinkedListService<T> linkedList = new LinkedListService<T>();
    //enqueue internally call append method in linked list.It adds elements at rear of the queue
    public void enQueue(T data)
    {
        linkedList.append(data);
    }
    //method to print the queue
    public void print()
    {
        linkedList.display();
    }
}
