import java.util.Scanner;

public class CekPrimaRekursif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan n: ");
        int n = sc.nextInt();

        if (cekPrimaRekursif(n, n / 2) == 1) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }
    }

    static int cekPrimaRekursif(int n, int i) {
        if (i == 1) {
            return 1;
        } else {
            if (n % i == 0) {
                return 0;
            } else {
                return cekPrimaRekursif(n, i - 1);
            }
        }
    }
}