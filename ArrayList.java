import java.util.Arrays;
public class ArrayList<E> {
    private static final int smallSize = 4;
    private Object[] elements;
    private int size;
    private int capacity;
    public ArrayList(){
        this.elements = new Object[smallSize];
        int size = 0;
        this.capacity = smallSize;
    }
    public boolean add(E element){
        if (this.size == this.capacity){
            grow();
        }
        this.elements[this.size++] = element;
        return true;
    }
    public boolean add(int index, E element){
        if (index < 0 || index > this.size){
            return false;
        }
        rightMove(index);
        this.elements[index] = element;
        this.size++;
        return true;
    }
    public E get(int index){
        exception(index);
        return (E) this.elements[index];
    }
    public E set(int index, E element){
        exception(index);
        Object existing = this.elements[index];
        this.elements[index] = element;
        return (E) existing;
    }
    public E remove(int index){
        exception(index);
        Object existing = this.elements[index];
        leftMove(index);
        this.size--;
        ensureCapacity();
        return (E) existing;
    }
    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }
    private void rightMove(int index){
        for (int i = this.size - 1; i >= index; i--){
            this.elements[i + 1] = this.elements[i];
        }
    }
    private void leftMove(int index){
        for (int i = index; i < this.size - 1; i++){
            this.elements[i] = this.elements[i + 1];
        }
    }
    private void grow(){
        this.capacity *= 2;
        Object[] tmp = new Object[this.capacity];
        for (int i = 0; i < this.elements.length; i++){
            tmp[i] = this.elements[i];
        }
        this.elements = tmp;
    }
    private void ensureCapacity(){
        if (this.size > this.capacity / 3){
            return;
        }
        this.capacity /= 2;
        this.elements = Arrays.copyOf(this.elements, this.capacity / 2);
    }
    private void exception(int index){
        if (index < 0 || index > this.size){
            throw new IndexOutOfBoundsException("Can`t get index " + index +
                    "on ArrayList with " + this.size + " elements");
        }
    }
}
