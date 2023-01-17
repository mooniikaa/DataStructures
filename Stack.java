public class Stack {
    private String arr[];
    private int top;
    private int capacity;

    Stack(int size)
    {
        arr = new String[size];
        capacity = size;
        top = -1;
    }

    public void push(String item)
    {
        if (isFull())
        {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(-1);
        }
        arr[++top] = item;
    }

    public String pop()
    {
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }

        return arr[top--];
    }

    public String peek()
    {
        if (isEmpty()) {
            System.exit(-1);
        }
        return arr[top];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}
