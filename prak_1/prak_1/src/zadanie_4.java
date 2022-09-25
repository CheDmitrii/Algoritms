import java.util.ArrayList;
import java.util.HashMap;

public class zadanie_4 {
    public static void main(String[] args) {
        Shop shoper = new Shop();
        shoper.addComp("001");
        shoper.addComp("002");
        shoper.addComp("003");
        shoper.addComp("004");
        shoper.addComp("005");
        shoper.deleteComp("003");
        shoper.deleteComp("005");
        shoper.deleteComp("005");
        shoper.findComp("001");
    }
}


class Shop{
    private int countComp;
    private ArrayList<String> namesComps;
//    private HashMap<String, Integer> komp;
    Shop(){
        namesComps = new ArrayList<>();
    }
    public void addComp(String ID){
        if (!namesComps.contains(ID)) {
            namesComps.add(ID);
        }
        this.countComp++;
    }
    public void deleteComp(String ID){
        if (countComp > 0){
            if (namesComps.contains(ID)) {
                namesComps.remove(ID);
                this.countComp--;
            }else {
                System.out.println("Error");
            }
        }else {
            System.out.println("Error");
        }
    }
    public void findComp(String ID){
        if (namesComps.contains(ID)){
            System.out.println("We have this model of computer");
        }else {
            System.out.println("We don't have this model");
        }
    }
}