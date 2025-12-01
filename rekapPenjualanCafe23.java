import java.util.Scanner;

public class rekapPenjualanCafe23 {
    static Scanner halomok = new Scanner(System.in);
    static String[] menu = {"kopi", "teh", "susu", "coklat", "latte"};
    static int[][] penjualan = new int[5][7]; 

    public static void ingputz() {
        System.out.println(">>> input penjualan 7 hari <<<");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("\nmenu: " + menu[i]);
            for (int h = 0; h < 7; h++) {
                System.out.print("hari " + (h + 1) + " = ");
                penjualan[i][h] = halomok.nextInt();
            }
        }
    }

    public static void nampil() {
        System.out.println("\n>>> tabel rekap penjualan <<<");
        System.out.print("menu/hari\t");
        for (int h = 1; h <= 7; h++) {
            System.out.print("h" + h + "\t");
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + "\t");
            for (int h = 0; h < 7; h++) {
                System.out.print(penjualan[i][h] + "\t");
            }
            System.out.println();
        }
    }

    public static void menuTertinggi() {
        int maxTotal = -1;
        String menuMax = "";

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int h = 0; h < 7; h++) {
                total += penjualan[i][h];
            }
            if (total > maxTotal) {
                maxTotal = total;
                menuMax = menu[i];
            }
        }

        System.out.println("\nmenu dengan total penjualan tertinggi:");
        System.out.println(menuMax + " : " + maxTotal + " porsi");
    }

    public static void rata() {
        System.out.println("\n>>> Rata-rata Penjualan <<<");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int h = 0; h < 7; h++) {
                total += penjualan[i][h];
            }
            double avg = total / 7.0;
            System.out.println(menu[i] + " : " + avg);
        }
    }

    public static void main(String[] args) {
        ingputz();
        nampil();
        menuTertinggi();
        rata();
    }

}
