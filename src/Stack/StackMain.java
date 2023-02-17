package Stack;

public class StackMain {
    public static <StackService> void main(String[] args)
    {
        StackService<Integer> stack;
        stack= new StackService<Integer>();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.print();
    }
}
