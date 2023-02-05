import java.util.*;
import java.lang.Math;

public class Closet {

    public static double calcDist(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double minimumDistance(List<double[]> points) {
        int n = points.size();
        System.out.println("The size of input is " + n);
        System.out.println("Runtime should be equal to or less than " + (n * Math.pow(Math.log(n), 2)));
        
        
        return 90;
    }
    

    public static void main(String[] args) {
        System.out.println("Starting Test");
        long startTime = System.currentTimeMillis();
        List<double[]> test = new ArrayList<double[]>();
        test.add(new double[]{1, 2});
        System.out.println(Closet.minimumDistance(test));
        long endTime = System.currentTimeMillis();
        System.out.println("Final runtime is " + ((endTime - startTime) / 1000F));
    }
}