public class Fibonacci {
    public static void main(String[] args) {
        int bulanKe12 = 12;

        int jumlahPasanganMarmut = hitungPasanganMarmut(bulanKe12);

        System.out.println(
                "Pada akhir bulan ke-" + bulanKe12 + ", jumlah pasangan marmut adalah: " + jumlahPasanganMarmut);
    }

    public static int hitungPasanganMarmut(int bulan) {
        if (bulan <= 2) {
            return 1;
        } else {

            return hitungPasanganMarmut(bulan - 1) + hitungPasanganMarmut(bulan - 2);
        }
    }
}
