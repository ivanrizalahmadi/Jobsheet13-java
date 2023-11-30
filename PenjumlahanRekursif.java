import java.util.Scanner;

public class PenjumlahanRekursif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai f: ");
        int f = sc.nextInt();

        int hasil = penjumlahanRekursif(f);
        System.out.println("Hasil penjumlahan: " + hasil);
    }

    static int penjumlahanRekursif(int f) {
        if (f <= 0) {
            return 0;
        } else {
            return f + penjumlahanRekursif(f - 1);
        }
    }
}