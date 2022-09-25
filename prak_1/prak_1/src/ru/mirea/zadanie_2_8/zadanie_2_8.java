package ru.mirea.zadanie_2_8;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class zadanie_2_8 {
    public static void sortArr(String[] arr){
        int k = arr.length / 2;
        for (int i = 0; i < k; i++){
            String str = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = str;
        }
    }
    public static void main(String[] args) {
        String[] strArr = {"a", "b", "c", "d", "e"};
        sortArr(strArr);
        for (String i : strArr){
            System.out.println(i);
        }
    }
}
