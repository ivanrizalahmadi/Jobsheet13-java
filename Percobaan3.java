import java.util.Scanner;

public class Percobaan3 {

    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return saldo;
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tahun;
        double saldoAwal;

        System.out.print("Jumlah saldo awal: ");
        saldoAwal = sc.nextInt();

        System.out.print("Masukkan lama investasi (dalam tahun): ");
        tahun = sc.nextInt();

        System.out.print("Jumlah saldo setelah " + tahun + " tahun : ");
        System.out.print(hitungLaba(saldoAwal, tahun));

        sc.close();
    }
}
