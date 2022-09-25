package zadanie_4_3.prak_4;

import java.util.HashMap;
import java.util.Scanner;

public class ClothingStore {

    private HashMap<Clothing, Integer> bag;
    static private Acounts[] acounts = Acounts.values();

    public void addThing(String str, int i){
        if (Clothing.addThing(str, i)){
            for (Clothing thing : Clothing.values()){
                if (thing.getType().equals(str)){
                    bag.put(thing, i);
                }
            }
        }
    }
    static public boolean chekLogin(String login){
        for (int i = 0; i < acounts.length; i++){
            if (login.equals(acounts[i].getLogin())){
                return true;
            }
        }
        return false;
    }
    static public void chakLog(String login){
        if (!chekLogin(login)){
            System.out.println("uncorrect login, try again");
        }
    }
    static public boolean chekPasword(String pasword){
        for (int i = 0; i < acounts.length; i++){
            if (acounts[i].getPasword().equals(pasword)){
                return true;
            }
        }
        return false;
    }
    static public void chakPas(String pasword){
        if (!chekPasword(pasword)){
            System.out.println("uncorrect pasword, try again");
        }
    }
    ClothingStore(){
        bag = new HashMap<>();
    }



    public static void main(String[] args) {
        ClothingStore clothingStore = new ClothingStore();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your login:");
        String login;
        do {
            login = scanner.next();
            chakLog(login);
        }while (!chekLogin(login));
        System.out.println("enter your pasword:");
        String pasword;
        do {
            pasword = scanner.next();
            chakPas(pasword);
        }while (!chekPasword(pasword));
        System.out.println("Hello, " + login + "\n");
        System.out.println("What do you want by?\n");
        Clothing.LokkClothings();
        String thing  = scanner.next();
        int i = scanner.nextInt();
        clothingStore.addThing(thing, i);

    }
}
