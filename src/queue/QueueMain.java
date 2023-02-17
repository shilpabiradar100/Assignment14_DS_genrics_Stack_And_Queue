package queue;

public class QueueMain {
    public static void main(String args[])
    {
        QueueService<Integer> queue = new QueueService<Integer>();
        System.out.println("Create a simple queue");
        queue.enQueue(56);
        queue.enQueue(30);
        queue.enQueue(70);
        queue.print();
        System.out.println("Queue after using deque method");
        queue.deQueue();
        queue.print();
    }
}
