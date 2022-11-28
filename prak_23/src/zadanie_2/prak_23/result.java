package zadanie_2.prak_23;

public class result {
    public static void main(String[] args) {
        LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();
        for (int i = 0; i <= 10; i++){
            linkedQueue.addEllement(i);
        }
        linkedQueue.clear();
        System.out.println(linkedQueue.isEmpty());
    }
}
