package recurtion;

public class StringInString {
    public static void stroka(String bigString, String smallString){
        if (bigString.length() < smallString.length()){
            System.out.println("NO");
        }else {
            if (bigString.substring(0, smallString.length()).equals(smallString)){
                System.out.println("YES");
            }else {
                stroka(bigString.substring(1), smallString);
            }
        }
    }

    public static void main(String[] args) {
        stroka("Hello worldtytytyttfgghv jhgffghjiiiiiiii", "jhgffghh");
    }
}
