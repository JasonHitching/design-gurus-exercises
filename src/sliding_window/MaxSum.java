package sliding_window;
/**
 * Given an array of positive numbers and a positive number ‘k,’
 * find the maximum sum of any contiguous sub-array of size ‘k’.
 *
 * Input: [2, 1, 5, 1, 3, 2], k=3
 * Output: 9
 * Explanation: Sub-array with maximum sum is [5, 1, 3].
 */
public class MaxSum {

    // Constructor
    public MaxSum () {};

    /**
     * Brute force algorithm for solving the problem
     *
     * @param numArray array containing integers for analysis
     * @param k desired size of sub array
     * @return maximum sum of 'k' sized sub array
     */
    public int bruteFindMaxSumK(int[] numArray, int k) {
        int maxSum = 0;

        // Loop array.length - k to prevent nested loop from going out of bounds
        for(int i = 0;  i < numArray.length - k; i++) {
            int kSum = 0; // Variable for tracking current sub-array sum
            // 'i + k' moves through the array in sub-array sizes of 'k'
            for (int j = i; j < i + k; j++) {
                kSum += numArray[j];
            }
            if (kSum > maxSum) {
                maxSum = kSum;
            }
        }
        return maxSum;
    }

    /**
     * Sliding window optimal solution
     *
     * @param numArray array containing integers for analysis
     * @param k desired size of sub array
     * @return maximum sum of 'k' sized sub array
     */
    public int optimalFindMaxSumK(int[] numArray, int k) {
        int windowStart = 0; // Pointer for the start of the sliding window
        int windowSum = 0;
        int maxSum = 0;

        for(int windowEnd = 0; windowEnd < numArray.length; windowEnd ++) {
            windowSum += numArray[windowEnd];
            if(windowEnd >= k) {
                maxSum = Math.max(windowSum, maxSum);
                windowSum = 0;
            }
            windowStart++; // Slide the window across by one

        }
        return maxSum;
    }
}