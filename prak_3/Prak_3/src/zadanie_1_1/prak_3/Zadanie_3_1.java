package zadanie_1_1.prak_3;

import java.util.Random;
import java.util.Scanner;

public class Zadanie_3_1 {
    static public double[] arrayMath(int n, int k){
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Math.random() * k;
        }
        return arr;
    }
    static public double[] arrayRandom(int n, int k){
        Random random = new Random();
        double[] arr = new double[n];
        for (int i =  0; i < arr.length; i++){
            arr[i] = random.nextDouble(k);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        double[] arr = arrayMath(n, k);
        double[] array = arrayRandom(n, k);
        System.out.println();
        System.out.println("Math array:");
        for (double i : arr){
            System.out.print(String.format("%.2f" + " ", i));
        }
        System.out.println();
        System.out.println();
        System.out.println("Random array:");
        for (double i : array){
            System.out.print(String.format("%.2f ", i));
        }
        System.out.println();
    }
}
