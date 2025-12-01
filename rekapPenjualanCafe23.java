import java.util.Scanner;

public class rekapPenjualanCafe23 {
  public static void main(String[] args) {
        Scanner halomok = new Scanner(System.in);
        System.out.print("masukkan jumlah menu = ");
        int jumlahmenuh = halomok.nextInt();
        halomok.nextLine();

        String[] menu = new String[jumlahmenuh];

        System.out.println("\nmasukkan nama menu:");
        for (int i = 0; i < jumlahmenuh; i++) {
            System.out.print("menu ke-" + (i + 1) + " = ");
            menu[i] = halomok.nextLine();
        }

        System.out.print("\nmasukkan jumlah hari penjualan = ");
        int jumlahdayz = halomok.nextInt();

        int[][] penjualan = new int[jumlahmenuh][jumlahdayz];

        System.out.println("\n>>> input penjualan <<<");
        for (int i = 0; i < jumlahmenuh; i++) {
            System.out.println("\nmenu: " + menu[i]);
            for (int h = 0; h < jumlahdayz; h++) {
                System.out.print("hari " + (h + 1) + ": ");
                penjualan[i][h] = halomok.nextInt();
            }
        }

        System.out.println("\n>>> rekap Ppnjualan <<<");
        System.out.print("menu\t");
        for (int h = 1; h <= jumlahdayz; h++) System.out.print("H" + h + "\t");
        System.out.println();

        for (int i = 0; i < jumlahmenuh; i++) {
            System.out.print(menu[i] + "\t");
            for (int h = 0; h < jumlahdayz; h++) {
                System.out.print(penjualan[i][h] + "\t");
            }
            System.out.println();
        }

        int maxTotal = -1;
        String menuMax = "";
        for (int i = 0; i < jumlahmenuh; i++) {
            int total = 0;
            for (int h = 0; h < jumlahdayz; h++) total += penjualan[i][h];

            if (total > maxTotal) {
                maxTotal = total;
                menuMax = menu[i];
            }
        }
        System.out.println("\nmenu penjualan tertinggi: " + menuMax + " (" + maxTotal + ")");

        System.out.println("\n>>> rata rata penjualan <<<");
        for (int i = 0; i < jumlahmenuh; i++) {
            int total = 0;
            for (int h = 0; h < jumlahdayz; h++) total += penjualan[i][h];
            double avg = total / (double) jumlahdayz;
            System.out.println(menu[i] + " : " + avg);
        }
    }
}
