import java.util.*;
import java.lang.Math;

public class Closest {

    public static double calcDist(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void sortPoints(List<double[]> points) {
        Collections.sort(points, new Comparator<double[]>() {

            @Override
            public int compare(double[] c1, double[] c2) {
                int xComp = Double.compare(c1[0], c2[0]);

                if (xComp != 0) {
                    return xComp;
                }

                return Double.compare(c1[1], c2[1]);
            }
        });
    }

    public static double minimumDistance(List<double[]> points) {
        Closest.sortPoints(points);
        
        return 90;
    }
    

    public static void main(String[] args) {
        List<double[]> test = new ArrayList<double[]>();
        test.add(new double[]{3, 1.5});
        test.add(new double[]{2, 2.5});
        test.add(new double[]{0, 0});
        System.out.println("Return value: " + Closest.minimumDistance(test));
    }
}