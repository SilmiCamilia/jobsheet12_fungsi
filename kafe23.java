import java.util.Scanner;

public class kafe23 {
     public static void menu(String namaPelanggan, boolean isMember) {

        System.out.println("Selamat Datang," + " " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda mendapatkan diskon 10% sebagai member kafe kami.");
        }

        System.out.println("=== Menu Resto Kafe ===");
        System.out.println("1. Kopi Hitam- Rp 15.000");
        System.out.println("2. Cappucino- Rp 20.000");
        System.out.println("3. Latte- Rp 22.000");
        System.out.println("4. TehTarik- Rp 12.000");
        System.out.println("5. Roti Bakar- Rp 10.000");
        System.out.println("6. Mie Goreng- Rp 18.000");
        System.out.println("==========================");
        System.out.println("Silahkan pilih menu yang anda inginkan:");
    }
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int [] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItem[pilihanMenu -1] * banyakItem;
        if (kodePromo != null && kodePromo.equals("DISKON50")) {
            System.out.println("Diskon 50% berhasil!");
            hargaTotal = hargaTotal / 2; // Diskon 50%
        } else if (kodePromo != null && kodePromo.equals("DISKON30")) {
            System.out.println("Diskon 30% berhasil!");
            hargaTotal = hargaTotal - (int)(hargaTotal * 0.3); 
        } else if (kodePromo != null && !kodePromo.equals("")) {
            System.out.println("Kode invalid");
        }
        return hargaTotal;
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        return hitungTotalHarga(pilihanMenu, banyakItem, "");
    }
    public static void main(String[] args) {
        Scanner ingputz = new Scanner(System.in);

        menu("Andi", true);
        System.out.print("Masukkan nomor menu yang anda pesan:");
        int pilihanMenu = ingputz.nextInt();
        System.out.print("Masukkan banyak item yang anda pesan:");
        int banyakItem = ingputz.nextInt();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);

        System.out.println("Total yang harus anda bayar: Rp" + totalHarga);

    }

}
