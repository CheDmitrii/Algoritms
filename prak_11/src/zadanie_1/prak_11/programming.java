package zadanie_1.prak_11;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class programming {
    public static void main(String[] args) {
        System.out.println("name of creator:\nDmitrii Chebykin");
        LocalDate localDate = LocalDate.of(2022, 11, 21);
        System.out.println("date of create programm:");
        System.out.println(localDate);
        System.out.println("\ndate of pass programm:");
        Date date = new Date(2022, 11, 21, 15, 4);
        System.out.println(date);
    }
}
