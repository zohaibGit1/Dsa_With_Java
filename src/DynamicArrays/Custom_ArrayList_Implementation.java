package DynamicArrays;

public class Custom_ArrayList_Implementation {
    public static void main(String[] args) {

        ArrayImpl ar = new ArrayImpl();
        for (int i = 0; i < 45; ++i) {
            System.out.println(ar.size() + " " + ar.capacity());
            ar.add(i);
        }
    }
}

class ArrayImpl {

    private int []arr;
    private int capacity;
    private int size = 10;

    ArrayImpl() {
        arr = new int[10];
        size = 0;
        capacity = 10;
    }

    void add(int num) {

        if(size == capacity) {
            int []newArr= new int[2 * capacity];
            for (int i = 0; i < capacity; ++i) {
                newArr[i] = arr[i];
            }
                this.arr= newArr;
                capacity *= 2;
        }
        arr[size] = capacity;
        size++;
    }

    void remove() {
        if(size > 0) {
            this.arr[size - 1] = 0;
            size--;
        }
    }

    void set(int id, int num) {
        if(id >= 0 && id < size) {
            this.arr[id] = num;
        }
    }

    int get(int id) {
        if(id>= 0 && id < size) {
            return this.arr[id];
        }
        return -1;
    }

    int size()  {
        return this.size;
    }

    int capacity() {
        return this.capacity;
    }
}
