package zadanie_2.prak_23;

public interface Queue <T>{
    void addEllement(T element);
    void clear();
    boolean isEmpty();
    T element();
    T firstElement();
    int size();
}
