package zadanie_4_3.prak_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public enum Clothing {
    TIE(5, "Tie"),
    TSHIRT(10, "Tshirt"),
    PANTS(10, "Pants"),
    SHIRT(7, "Shirt"),
    JACKET(12, "Jacket"),
    SHOSE(20, "Shose");
    private int countClothing;
    private String type;
    static final public String tie ="Tie";
    static final public String tshort ="Tshort";
    static final public String pants ="Pants";
    static final public String shirt ="Shirt";
    static final public String jacket ="Jacket";
    static final public String shose ="Shose";
    Clothing(int countClothing, String type){
        this.type = type;
        this.countClothing = countClothing;
    }
    public void bytClothing(int i){
        if (countClothing - i >= 0){
            countClothing -= i;
        }else {
            System.out.println("You can by only " + countClothing + " " + this.toString());
        }
    }
    static public boolean addThing(String str, int i){
            switch (str){
                case (tie):
                    if (TIE.countClothing - i >= 0){
                        System.out.println("Thing added");
                        TIE.countClothing -= i;
                        return true;
                    }else {
                        System.out.println("You can added this thing");
                        return false;
                    }
                case (shirt):
                    if (SHIRT.countClothing - i >= 0){
                        System.out.println("Thing added");
                        SHIRT.countClothing -= i;
                        return true;
                    }else {
                        System.out.println("You can added this thing");
                        return false;
                    }
                case (tshort):
                    if (TSHIRT.countClothing - i >= 0){
                        System.out.println("Thing added");
                        TSHIRT.countClothing -= i;
                        return true;
                    }else {
                        System.out.println("You can added this thing");
                        return false;
                    }
                case (pants):
                    if (PANTS.countClothing - i >= 0){
                        System.out.println("Thing added");
                        PANTS.countClothing -= i;
                        return true;
                    }else {
                        System.out.println("You can added this thing");
                        return false;
                    }
                case (jacket):
                    if (JACKET.countClothing - i >= 0){
                        System.out.println("Thing added");
                        JACKET.countClothing -= i;
                        return true;
                    }else {
                        System.out.println("You can added this thing");
                        return false;
                    }
                case (shose):
                    if (SHOSE.countClothing - i >= 0){
                        System.out.println("Thing added");
                        SHOSE.countClothing -= i;
                        return true;
                    }else {
                        System.out.println("You can added this thing");
                        return false;
                    }
                default:
                    System.out.println("Error 404404");
                    return false;
            }
    }
    public String getType(){
        return this.type;
    }
    static public void LokkClothings(){
        System.out.println("Your lookbook:");
        for (Clothing i : Clothing.values()){
            System.out.println(i.toString() + ": " + i.countClothing + " things");
        }
    }
    static void clearBag(HashMap<Clothing, Integer> arr){
        for (Clothing i : arr.keySet()){
            i.countClothing += arr.get(i);
        }
        arr.clear();
    }
}
