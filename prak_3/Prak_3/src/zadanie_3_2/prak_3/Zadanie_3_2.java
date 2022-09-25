package zadanie_3_2.prak_3;

import java.util.Random;
import java.util.Scanner;

public class Zadanie_3_2 {
    private Circle[] circles;
    Zadanie_3_2(){
        circles = new Circle[0];
    }
    Zadanie_3_2(int n){
        circles = new Circle[n];
        for (int i = 0; i < circles.length; i++){
            circles[i] = new Circle();
        }
    }
    public void addCircle(Circle circle){
        Circle[] arr = new Circle[circles.length];
        for (int i = 0; i < circles.length; i++){
            arr[i] = circles[i];
        }
        this.circles = new Circle[arr.length + 1];
        for (int i = 0; i < arr.length; i++){
            circles[i] = arr[i];
        }
        circles[arr.length] = circle;
    }

    public Circle minCircle(){
        if (circles.length != 0){
            double min = circles[0].getR();
            int k = 0;
            for (int i = 0; i < circles.length; i++){
                if (circles[i].getR() < min){
                    min = circles[i].getR();
                    k = i;
                }
            }
            return circles[k];
        }else{
            Circle circle = new Circle(0, 0, 0);
            return circle;
        }
    }

    public void sortCircles(){
        for (int i = 0; i < circles.length; i++){
            for (int j = 1; j < circles.length; j++){
                if (circles[j - 1].getR() > circles[j].getR()){
                    Circle help = circles[j - 1];
                    circles[j - 1] = circles[j];
                    circles[j] = help;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Zadanie_3_2 zadanie32 = new Zadanie_3_2(n);
        for (int i = 0; i < zadanie32.circles.length; i++){
            zadanie32.circles[i].setR(Math.random() * 10);
        }
        zadanie32.sortCircles();
        for (int i = 0; i < zadanie32.circles.length; i++){
            System.out.print(String.format("%.2f, ", zadanie32.circles[i].getR()));
        }
        System.out.println();
    }
}
