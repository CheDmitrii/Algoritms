package zadaniee_4_2.prak_4;

public class Tie extends Clothes implements MenClothing{
    public static final String type = "Tie";

    public Tie() {
        super(1);
    }

    @Override
    public void dressMan() {
        System.out.println("Tie dressed on the man");
    }
}
