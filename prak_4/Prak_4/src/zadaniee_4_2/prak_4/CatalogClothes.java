package zadaniee_4_2.prak_4;

public enum CatalogClothes {
    PANTS("Pants"),
    TSHIRT("Tshirt"),
    SKIRT("Skirt"),
    TIE("Tie");

    private String type;
    CatalogClothes(String type){
        this.type = type;
    }
    public static Clothes[] toClothes(){
        Clothes[] clothes = new Clothes[4];
        clothes[0] = new Pants();
        clothes[1] = new Tshirt();
        clothes[2] = new Skirt();
        clothes[3] = new Tie();
        return clothes;
    }
//    static String[] get
}
