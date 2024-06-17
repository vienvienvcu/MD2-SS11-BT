package BT7;

public class MyList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Object[] elements;
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        elements = new Object[capacity];
    }

//    CAC PHUONG THUC
//    chen phan tu vao mang
    public void add(int index, E o ) {
         if (index < 0 || index > size) {
             System.err.println("index out of bounds");
             return;
         }
         Object [] newElements = new Object[DEFAULT_CAPACITY];
         if (index>= DEFAULT_CAPACITY ) {
             newElements = new Object[size +1];
         }
         for (int i =0; i <newElements.length; i++) {
             if (i< index) {
                 newElements[i] = elements[i];
             }else if (i == index) {
                 newElements[i] = o;
             }else {
                 newElements[i] = elements[i - 1];
             }

         }
         size ++;
         elements = newElements;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            System.err.println("index out of bounds");
            return null;
        }
        E oldElement = get(index);
        Object [] newElements = new Object[size - 1];
        for (int i =0; i <newElements.length; i++) {
            if (i< index) {
                newElements[i] = elements[i];
            }else {
                newElements[i] = elements[i + 1];
            }
        }
        size--;
        elements = newElements;
        return oldElement;
    }
    public E get(int index) {
        if (index < 0 || index >= size) {
            System.err.println("index out of bounds");
            return null;
        }
        for (int i =0; i < size; i++) {
            if (i == index) {
                return (E) elements[i];
            }
        }
        return null;
    }
    public int size() {
        return this.size;
    }
    // phương thức trả về một
    public Object clone() {
        MyList<E> newElement = new MyList<>();
        for (int i =0; i < size; i++) {
            newElement.add((E) elements[i]);
        }
        return newElement;
    }
    public boolean contains(E o) {
           return indexOf(o)>=0;
    }
    public boolean add(E e) {
        add(size, e);
        return true;
    }

    public int indexOf(Object o) {
        for (int i =0; i < size; i++) {
            if (this.elements[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public void ensureCapacity(int minCapacity) {
        elements = new Object[minCapacity];
    }
    public void clear() {
        this.size = 0;
        elements = new Object[size];
    }
    @Override
    public String toString() {
        // [1, 2, 3, 4]
        StringBuilder result = new StringBuilder("[ ");
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                result.append(this.elements[i]);
            } else {
                result.append(this.elements[i] + ", ");
            }
        }
        result.append(" ]");
        return result.toString();
    }






}
