import java.util.*;
import java.lang.Math;

public class Closet {

    public static double calcDist(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double minimumDistance(List<double[]> points) {
        
        
        return 90;
    }
    

    public static void main(String[] args) {
        List<double[]> test = new ArrayList<double[]>();
        test.add(new double[]{1, 2});
        System.out.println(Closet.minimumDistance(test));
        System.out.println(Closet.calcDist(2, 2.5, 3, 1.5));
    }
}