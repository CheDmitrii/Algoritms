package ru.mirea.zadanie_2_10;

import java.util.Scanner;

public class zadanie_2_10 {
    public static void HowMany(String str){
        String[] arr = str.split(" ");
        System.out.println(arr.length);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        HowMany(str);
    }
}