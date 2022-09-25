public class zadanie_5 {
    public static void main(String[] args) {
        Dog []priyt = new Dog[2];
        for (int i = 0; i < priyt.length; i++){
            priyt[i] = new Dog();
        }
        priyt[0].setName("Bobik");
        priyt[0].setAge(9);
        priyt[1].setName("Jprik");
        priyt[1].setAge(1);
        for (int i = 0; i < priyt.length; i++){
            System.out.println(priyt[i].getName() + " " + priyt[i].getAge());
        }
    }
}



class Dog{
    private int age;
    private String name;

    Dog(){}
    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public int likePeople(){
        return this.age * 7;
    }
    public String toString(){
        String str = name + " " + age;
        return str;
    }
}