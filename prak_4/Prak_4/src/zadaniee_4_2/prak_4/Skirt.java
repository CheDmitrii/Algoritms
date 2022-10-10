package zadaniee_4_2.prak_4;

public class Skirt extends Clothes implements WomanClothing {
    public static final String type = "Skirt";

    Skirt(){
        super(-1);
    }
    @Override
    public void dressWoman() {
        System.out.println("Skirt dresed on woman");
    }
}
