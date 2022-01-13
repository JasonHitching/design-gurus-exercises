package sliding_window;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        int[] numArray = {2, 1, 5, 1, 3, 2};
        int k = 3;
        MaxSum maxSumK = new MaxSum();

        int bruteResult = maxSumK.bruteFindMaxSumK(numArray, k);
        System.out.println("Brute force solution " + bruteResult);

        int optimalResult = maxSumK.optimalFindMaxSumK(numArray, k);
        System.out.println(optimalResult);
    }
}
