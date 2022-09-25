package ru.mirea.zadanie_2_9;

public class number {
    private int[] num;

    number(){
        num = new int[0];
    }

    public void addInt(int t){
        int[] arr = new int[num.length];
        for (int i = 0; i < num.length; i++){
            arr[i] = num[i];
        }
        num = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++){
            num[i] = arr[i];
        }
        num[arr.length] = t;
    }
    public boolean isNum(int y){
        for (int i = 0; i < num.length; i++){
            if (num[i] == y){
                return true;
            }
        }
        return false;
    }
}
