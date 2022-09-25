package zadanie_3_4.prak_3;

import java.util.Random;
import java.util.Scanner;

public class IntMas {
    static public int[] addInArray(int[] arr, int j){
        int[] array = new int[arr.length];
        for (int i = 0; i < array.length; i++){
            array[i] = arr[i];
        }
        arr = new int[array.length + 1];
        for (int i = 0; i < array.length; i++){
            arr[i] = array[i];
        }
        arr[array.length] = j;
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        do {
            if (n < 0){
                System.out.println("error, try again");
                n = scanner.nextInt();
            }else {
                break;
            }
        }while (true);
        int[] arr = new int[n];
        int k = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(n + 1);
            System.out.print(arr[i] + ", ");
            if (arr[i] % 2 == 0){
                k++;
            }
        }
        System.out.println();
        int[] newArray = new int[0];
        if (k != 0){
            for (int i = 0; i < arr.length; i++){
                if (arr[i] % 2 == 0){
                    newArray = addInArray(newArray, arr[i]);
                }
            }
        }else {
            System.out.println("there aren't any even numbers");
        }
        for (int i : newArray){
            System.out.print(i + ", ");
        }
//        syda:
//        {
//            int n = scanner.nextInt();
//            if (n < 0) {
//                System.out.println("error, try again");
//                break syda;
//            }
//        }
    }
}
