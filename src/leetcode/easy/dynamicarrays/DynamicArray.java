package leetcode.easy.dynamicarrays;

public class DynamicArray {

    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArray() {
        // instantiate a new fixed size array
        this.array = new Object[capacity];
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }


    public void add(Object data) {
        if (size >= capacity) {
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data) {
        if (size >= capacity) {
            grow();
        }
        for (int i = size; i > index; i--) {
            //underlying algorithm to shift all the elements to the right
            array[i] = array[i - 1];
        }
        //whatever the index we want to set our data, pass the data object
        array[index] = data;
        //increase the size by 1
        size++;
    }

    public void delete(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                // whenever we delete, we shift the elements 1 spot towards left
                for (int j = 0; j < (size - i-1); j++) {
                    array[i + j] = array[i + j+1];
                }
                array[size - 1] = null;
                size--;
                if (size <= (int) (capacity/3)) {
                    shrink();
                }
                break;
            }
        }
    }

    public int search(Object data) {

        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    private void grow() {
        int newCapacity = (int) capacity * 2;
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    public void shrink() {
        int newCapacity = (int) capacity / 2;
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {

        String str = "";

        for (int i = 0; i < capacity; i++) {
            str += array[i] + ", ";
        }
        if (str != "") {
            str = "[" + str.substring(0, str.length() - 2) + "]";
        }
        else {
            str = "[]";
        }
        return str;
    }

}
