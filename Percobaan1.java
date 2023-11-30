import java.util.Scanner;

public class Percobaan1 {

    static int FaktorialRekursif(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * FaktorialRekursif(n - 1);
        }
    }

    static int FaktorialIteratif(int n) {
        int faktor = 1;
        for (int i = n; i >= 1; i--) {
            faktor = faktor * i;
        }
        return faktor;
    }

    public static void main(String[] args) {
        System.out.println(FaktorialRekursif(5));
        System.out.println(FaktorialIteratif(5));
    }
}
