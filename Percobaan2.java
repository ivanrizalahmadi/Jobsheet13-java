import java.util.Scanner;

public class Percobaan2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = sc.nextInt();

        System.out.print("Masukkan pangkat: ");
        int pangkat = sc.nextInt();

        int hasilPangkat = hitungPangkat(bilangan, pangkat);
        System.out.println("Hasil " + bilangan + " pangkat " + pangkat + " adalah: " + hasilPangkat);

        System.out.print("Deret perhitungan pangkat: ");
        cetakDeretPangkat(bilangan, pangkat);

        sc.close();
    }

    public static int hitungPangkat(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * hitungPangkat(base, exponent - 1);
        }
    }

    public static void cetakDeretPangkat(int base, int exponent) {
        for (int i = 1; i <= exponent; i++) {
            System.out.print(base);
            if (i < exponent) {
                System.out.print("x");
            }
        }
        System.out.println(" = " + hitungPangkat(base, exponent));
    }
}
