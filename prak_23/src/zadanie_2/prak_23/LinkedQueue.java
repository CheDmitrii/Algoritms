package zadanie_2.prak_23;

public class LinkedQueue<T> implements Queue<T>{// num1 num2 num3
    private Node<T> first;
    private Node<T> last;
    private static int size;

    public LinkedQueue() {size = 0;}

    @Override
    public void addEllement(T element) {
        if (!isEmpty()){
            Node<T> el = new Node<>(element, null);
            this.last = new Node<>(element, null);
        }else {
            this.last = null;
            this.first = new Node<>(element, this.last);
        }
        size++;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T element() {
        return this.first.element;
    }

    @Override
    public T firstElement() {
        T el = this.first.element;
        this.first = this.first.next;
        size--;
        return el;
    }

    @Override
    public int size() {
        return size;
    }


}


class Node<T>{
    T element;
    Node<T> next;

    public Node(T element, Node<T> next) {
        this.element = element;
        this.next = next;
    }
}