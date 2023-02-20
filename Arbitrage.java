import java.util.*;
import java.lang.Math;

public class Arbitrage {

    /*
    QUESTIONS:
    - Can we assume that we should always start from currencies[0]?
     */

    public List<Integer> arbitrage(int[][] currencies, double[] weights) {
        double currentProfit = 1;
        List<Integer> path = new ArrayList<Integer>();


        if (currentProfit > 1 && path.size() > 1) {
            return path;
        }
        return null;
    }

    public static void main(String[] args) {
        Arbitrage A = new Arbitrage();
        int[][] tCurrencies = new int[3][2];
        tCurrencies[0] = new int[]{1,2};
        tCurrencies[1] = new int[]{2,3};
        tCurrencies[2] = new int[]{3,1};
        double[] tWeights = new double[]{130.0, 0.006, 1.3};
        System.out.println("Return value: " + A.arbitrage(tCurrencies, tWeights));
    }
}

