public class Queue {
    private String[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    Queue(int size)
    {
        arr = new String[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }
    public String remove()
    {
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }
        String x = arr[front];
        front = (front + 1) % capacity;
        count--;

        return x;
    }
    public void add(String item)
    {
        if (isFull())
        {
            System.out.println("Overflow\nProgram Terminated");
            System.exit(-1);
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }
    public String peek()
    {
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }
        return arr[front];
    }
    public int size() {
        return count;
    }
    public boolean isEmpty() {
        return (size() == 0);
    }
    public boolean isFull() {
        return (size() == capacity);
    }
}
