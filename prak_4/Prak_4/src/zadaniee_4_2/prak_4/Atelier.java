package zadaniee_4_2.prak_4;

public class Atelier {

    public static void main(String[] args) {
        Clothes[] clothes = CatalogClothes.toClothes();
        for (int i = 0; i < clothes.length; i++){
            if (clothes[i].getIsMale() == 1){
                System.out.println("it's male clothes");
            } else if (clothes[i].getIsMale() == -1) {
                System.out.println("it's female clouthes");
            }else{
                System.out.println("it's unisex clouthes");
            }
        }
    }
}
