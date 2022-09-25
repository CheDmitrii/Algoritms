import java.util.Scanner;

public class zadanie_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circleee[] krug = new Circleee[2];
        for (int i = 0; i < krug.length; i++){
            krug[i] = new Circleee();
        }
        for (int i = 0; i < 2; i++){
            krug[i].setX(scanner.nextDouble());
            krug[i].setY(scanner.nextDouble());
            krug[i].setR(scanner.nextDouble());
        }
        for (int i = 0; i < krug.length; i++){
            System.out.println("Circle" + i + 1 + ":");
            System.out.println("X: " + krug[i].getX());
            System.out.println("Y: " + krug[i].getY());
            System.out.println("Y: " + krug[i].getY());
        }
    }
}

class Point{
    private double x;
    private double y;
    Point(){}
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Circle extends Point{
    private double r;
    Circle(){
        super();
    }
    Circle(double x, double y, double r){
        super(x, y);
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }
}