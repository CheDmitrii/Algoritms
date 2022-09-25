package ru.mirea.zadanie_2_9;

import java.util.Random;
import java.util.Scanner;

public class Zadanie_2_9 {
    static public String[] cards = {"два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "валет", "дама", "король", "туз"};
    static public String[] mast = {"пики", "черви", "крести", "буби"};
    public static void Poker(int n){
        number Carti = new number();
        Random random = new Random();
//        int k = 65 / n;
        for (int i = 1; i <= n; i++){
            System.out.println("player number " + i + ":");
            for (int j = 0; j < 5; j++) {
                int r, m;
                boolean bol;
                do {
                    r = random.nextInt(13);
                    m = random.nextInt(4);
                    bol = Carti.isNum(r * 10 + m);
//                    r = (int) (Math.random() * (12));
//                    m = (int) (Math.random() * 10);
                } while (bol);
                System.out.print(cards[r] + " " + mast[m] + ", ");
                Carti.addInt(10 * r + m);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many people will play?");
        int n = scanner.nextInt();
        Poker(n);
    }
}
