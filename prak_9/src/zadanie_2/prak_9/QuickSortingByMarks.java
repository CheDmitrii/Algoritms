package zadanie_2.prak_9;

public class QuickSortingByMarks {
    public static void fastSort(Student2[] student2s, Student2 low, Student2 hight){
        if (student2s.length == 0 || low.compareTo(hight) >= 0){
            return;
        }
        double middle = low.getMediumeMark() + (hight.getMediumeMark() - low.getMediumeMark()) / 2;

    }

    public static void main(String[] args) {
    }
}
