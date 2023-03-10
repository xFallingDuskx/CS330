import java.util.*;
import java.lang.Math;

public class Closest {

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

    public static double calcDist(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double recurse(List<double[]> points) {
        int size = points.size();
        if (size == 2) {
            return Closest.calcDist(points.get(0)[0], points.get(0)[1], points.get(1)[0], points.get(1)[1]);
        } else if (size <= 1) {
            return Double.MAX_VALUE;
        }

        int medIdx = Math.floorDiv(size, 2); 
        System.out.println("Size of " + size + " has a medIdx of " + medIdx);
        double leftMin = recurse(points.subList(0, medIdx - 1));
        double rightMin = recurse(points.subList(medIdx + 1, size - 1));
        
        double trueMin;
        if (leftMin < rightMin) {
            trueMin = leftMin;
        }
        trueMin = rightMin;
        
        return trueMin;
    }

    public static double minimumDistance(List<double[]> points) {
        Closest.sortPoints(points);
        double minDist = recurse(points);
        return minDist;
    }
    

    public static void main(String[] args) {
        List<double[]> test = new ArrayList<double[]>();
        test.add(new double[]{3, 1.5});
        test.add(new double[]{2, 2.5});
        test.add(new double[]{0, 0});
        System.out.println("Return value: " + Closest.minimumDistance(test));
    }
}