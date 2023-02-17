package Stack;

public class StackMain {
    public static void main(String[] args)
    {
        StackService<Integer> stack = new StackService<Integer>();
        System.out.println("Create a simple stack using linked list");
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.print();
        System.out.println("Stack after calling pop method");
        stack.pop();
        stack.print();
        stack.peak();
    }
}
