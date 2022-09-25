package zadanie_3_3.prak_3;

import java.util.Random;

public class Arrayss {
    static boolean isIncreasing(double[] arr){
        int k = 0;
        for (int i = 1; i < arr.length; i++){
            if(arr[i] <= arr[i - 1]){
                k++;
            }
        }
        return k == 0;
    }

    public static void main(String[] args) {
        Random random = new Random();
        double[] arr = new double[4];
        for (int i = 0; i < arr.length; i++){
            arr[i] = 10 + random.nextDouble(89);
            System.out.print(String.format("%.2f, ", arr[i]));
        }
        System.out.println();
        if (isIncreasing(arr)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
