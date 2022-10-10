package zadaniee_4_2.prak_4;

public class Tshirt extends Clothes implements MenClothing, WomanClothing{
    public static final String type = "Tshirt";
    Tshirt(){
        super();
    }

    @Override
    public void dressMan() {
        System.out.println("Tshirt dressed on the man.");
    }

    @Override
    public void dressWoman() {
        System.out.println("Tshirt dressed on the woman.");
    }
}
