public class Main {
    public static void main(String[] args) {
        Author avtor = new Author();
        String name = " Hugo";
        String email = "hugoBoss@mail.ru";
        char gen = 'm';
        avtor.setName(name);
        avtor.setEmail(email);
        avtor.setGender(gen);
        System.out.println(avtor.toString());
    }
}

class Author{
    private String name;
    private  String email;
    private char gender;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    Author(){}

    Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String toString(){
        String str = "My name is " + this.name + ", my email is " + this.email + " i ";
        if (this.gender == 'm'){
            str += "am man.";
        } else if (this.gender == 'f') {
            str += "am woman.";
        }else {
            str += "don't have gender.";
        }
        return str;
    }
}