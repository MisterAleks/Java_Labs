package Labs_Java.Lab_7_1;

/**
 * Created by Алексей on 13.05.2016.
 */
public class MinMax {
    static int min(int a, int b) {
        if (a < b) return a;
        else
            return b;
    }

    static long min(long a, long b) {
        if (a < b) return a;
        else
            return b;
    }

    static double min(double a, double b) {
        if (a < b) return a;
        else
            return b;
    }

    static int max(int a, int b) {
        if (a > b) return a;
        else
            return b;
    }

    static long max(long a, long b) {
        if (a > b) return a;
        else
            return b;
    }

    static double max(double a, double b) {
        if (a > b) return a;
        else
            return b;
    }
}
