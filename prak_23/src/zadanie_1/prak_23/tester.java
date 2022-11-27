package zadanie_1.prak_23;

import java.util.ArrayList;
import java.util.LinkedList;

public class tester {
    public static void main(String[] args) {
//        LinkedList
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        for (int i = 0; i < 5; i++){
            arrayQueue.enqueue(i + 6);
        }
        System.out.println(arrayQueue.element());
    }
}
