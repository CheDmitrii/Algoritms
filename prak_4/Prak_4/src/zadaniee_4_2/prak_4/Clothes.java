package zadaniee_4_2.prak_4;

public class Clothes {
    private Size size;
    private double price;
    private String color;

    Clothes(){
        this.size = null;
        this.price = 0;
        this.color = " no clothing";
    }
    Clothes(Size size, double price, String color){
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
