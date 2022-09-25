package zadaniee_4_2.prak_4;

public class Pants extends Clothes implements MenClothing, WomanClothing{
    @Override
    public void dressMan() {
        System.out.println("Pants dressed on the man.");
    }

    @Override
    public void dressWoman() {
        System.out.println("Pants dressed on the woman.");
    }
}
