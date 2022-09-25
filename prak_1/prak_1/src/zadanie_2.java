public class zadanie_2 {
    public static void main(String[] args) {
        Ball ball = new Ball(20, 15.2);
        System.out.println(ball.toString());
        ball.move( 3.45, - 1.23);
        System.out.println(ball.toString());
    }
}



class Ball{
    private double x;
    private double y;
    Ball(){}
    Ball(double x, double y){
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
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move(double deltaX, double deltaY){
        this.x += deltaX;
        this.y += deltaY;
    }

    public String toString(){
        String str = "X: " + this.x + ", Y: " + this.y + ".";
        return str;
    }
}