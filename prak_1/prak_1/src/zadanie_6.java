public class zadanie_6 {
    public static void main(String[] args) {
        Circleee krug1 = new Circleee();
        Circleee krug2 = new Circleee();
        krug1.setX(0);
        krug1.setY(0);
        krug1.setR(23);
        krug2.setX(1);
        krug2.setY(2);
        krug2.setR(15);
        System.out.println(krug1.square());
        System.out.println(krug1.difference(krug2));

    }
}
class Circleee {
    private double x;
    private double y;
    private double r;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }
    public double square(){
        return r * r * Math.PI;
    }
    public double length(){
        return 2 * r * Math.PI;
    }
    public boolean difference(Circleee B){
        return this.r > B.r;
    }
}
