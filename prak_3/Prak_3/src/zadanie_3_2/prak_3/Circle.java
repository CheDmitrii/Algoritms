package zadanie_3_2.prak_3;

public class Circle extends Point{
    private double r;


    public Circle(){
        super();
    }
    public Circle(double x, double y, double r){
        super(x, y);
        this.r = r;
    }
    public Circle(Point point, double r) {
        super(point.getX(), point.getY());
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

}
