package second.zadanie_3_1.prak_3;

public class DoubleOf {
    public static void main(String[] args) {
        int a = 120;
        Double b = Double.valueOf(a);
        String str = "1245.34";
        Double c = Double.parseDouble(str);
        System.out.println(b);
        System.out.println(c);
        Double w = 123.556;
        int y = w.intValue();
        double x = w.doubleValue();
        String dob = Double.toString(x);
        System.out.println(y);
        System.out.println(x);
        System.out.println(dob);
    }
}
