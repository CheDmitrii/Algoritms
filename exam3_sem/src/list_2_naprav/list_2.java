package list_2_naprav;

public class list_2<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public list_2(){
        head = tail = new Node<>();
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }


    public void addElemment(T date){
        if (isEmpty()){
            head.date = date;
            size++;
        }else {
            Node<T> helpTail = tail;
            tail = new Node<>(date, helpTail, null);
            helpTail.next = tail;
            size++;
        }
    }

    public void removeEllement(int index){
        if (!isEmpty()){
            if (size == 1){
                head = null;
            }else {
                if (index == 0){
                    head = head.next;
                    head.previe = null;
                }
                if (index == size - 1){
                    tail = tail.previe;
                    tail.next = null;
                }
                if (index != 0 && index != size - 1){
                    int i;
                    Node<T> helpNode;
                    if (index + 1 <= size / 2) {
                        i = 0;
                        helpNode = head;
                        while (i != index){
                            helpNode = helpNode.next;
                            i++;
                        }
                    }else {
                        i = size - 1;
                        helpNode = tail;
                        while (i != index){
                            helpNode = helpNode.previe;
                            i--;
                        }
                    }
                    Node<T> PrevHelpNode = helpNode.previe;
                    Node<T> NextHelpNode = helpNode.next;
                    PrevHelpNode.next = NextHelpNode;
                    NextHelpNode.previe = PrevHelpNode;
                }
            }
        }
    }

    private class Node<T>{
        private T date;
        private Node<T> previe;
        private Node<T> next;
        public Node(){}
        public Node(T date, Node<T> previe, Node<T> next){
            this.date = date;
            this.previe = previe;
            this.next = next;
        }

    }
}
