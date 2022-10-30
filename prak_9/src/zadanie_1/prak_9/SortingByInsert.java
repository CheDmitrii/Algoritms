package zadanie_1.prak_9;


public class SortingByInsert {

    public static void sortInsert(Student[] students){
        int j;
        for(int i = 1; i < students.length; i++){
            Student swap = students[i];
            for(j = i; j > 0 && swap.getID() < students[j - 1].getID(); j--){
                students[j] = students[j - 1];
            }
            students[j] = swap;
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[4];
        for (int i = 0; i < students.length; i++){
            students[i] = new Student();
        }
        students[0].setFirstName("Tom");
        students[0].setLastName("Set");
        students[0].setID(123);

        students[1].setFirstName("Tomilie");
        students[1].setLastName("Kent");
        students[1].setID(1233);

        students[2].setFirstName("Don");
        students[2].setLastName("Torreto");
        students[2].setID(23);

        students[3].setFirstName("Denis");
        students[3].setLastName("Miller");
        students[3].setID(111);

        sortInsert(students);

        for (Student i : students){
            System.out.println(i.getFirstName() + "\n" + i.getLastName() + "\n" + i.getID());
            System.out.println("\n");
        }
    }
}
