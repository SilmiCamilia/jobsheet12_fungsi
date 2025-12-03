import java.util.Scanner;

public class HitungBalok23 {
    static int hitungLuas(int pjg, int lbr) {
        int Luas = pjg * lbr;
        return Luas;
    }
    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner balok = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.print("Masukkan panjang balok: ");
        p = balok.nextInt();
        System.out.print("Masukkan lebar balok: ");
        l = balok.nextInt();
        System.out.print("Masukkan tinggi balok: ");
        t = balok.nextInt();

        L = hitungLuas (p, l);
        System.out.println("Luas alas balok adalah: " + L);
        vol = hitungVolume (t, p, l);
        System.out.println("Volume balok adalah: " + vol);
       
    }

}
