public class kubus23 {
    public static double volume(double s) {
        return s * s * s; 
    }

    public static double luasPermuka(double s) {
        return 6 * s * s; 
    }

    public static void main(String[] args) {
        double s = 5;

        System.out.println("volume kubus = " + volume(s));
        System.out.println("luas permukaan kubus = " + luasPermuka(s));
    }
}

