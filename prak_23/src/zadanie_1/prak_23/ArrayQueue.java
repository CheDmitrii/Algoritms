package zadanie_1.prak_23;

import java.util.Arrays;

public class ArrayQueue <T>{
    private T[] array;
    private int size;
//    private int head;
//    private int tail;

    private static final Object[] empty = {};

    {
        array = null;
        size = 0;
//        head = 0;
//        tail = 0;
    }

    public ArrayQueue(){};

    public boolean isEmpty(){
        return size == 0;
    }

    private Object[] grow(int newSize){
        int oldCapacity = size;
        size = newSize;
        if (oldCapacity > 0 && array != empty && array != null) {
            return array = Arrays.copyOf(array, newSize);
        } else {
            return array =  (T[]) new Object[newSize];
        }
    };

    private Object[] grow(){
        return grow(size + 1);
    }

    private void decreas(){
        T[] arr = (T[]) new Object[size - 1];
        for (int i = 1; i < size; i++){
            arr[i - 1] = array[i];
        }
        size--;
        array = (T[]) new Object[arr.length];
        for (int i = 0; i < size; i++){
            array[i] = arr[i];
        }
    }

    public void enqueue(T element){
        if (isEmpty()){
            grow(1);
            array[0] = element;
        }else {
            grow(size + 1);
            array[size - 1] = element;
        }
    }

    public T element(){
        if (isEmpty()){
            return null;
        } else {
            return array[0];
        }
    }

//    public T getElement(int index) {
//        if (isEmpty()){
//            return null;
//        }else{
//            if (index > size - 1 || index < 0){
//                return null;
//            }else {
//                return array[index];
//            }
//        }
//    }

    public T dequeue(){
        if (isEmpty()){
            return null;
        }else {
            T elem = array[0];
            decreas();
            return elem;
        }
    }

    public void showQueue(){
        for (int i = 0; i < size; i++){
            System.out.println(array[i] + " ");
        }
    }

    public void clear(){
        size = 0;
        array = null;
    }

    public int getSize(){
        return size;
    }
}
