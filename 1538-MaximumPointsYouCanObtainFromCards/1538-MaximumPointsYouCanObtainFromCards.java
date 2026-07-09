// Last updated: 7/9/2026, 9:46:24 AM
class Solution {
    public int maxScore(int[] cardPoints, int k)
    {
        int n = cardPoints.length;

        int total = 0;

        for(int num : cardPoints)
        {
            total += num;
        }

        if(k == n)
        {
            return total;
        }

        int windowSize = n - k;

        int windowSum = 0;

        for(int i = 0; i < windowSize; i++)
        {
            windowSum += cardPoints[i];
        }

        int minSum = windowSum;

        for(int i = windowSize; i < n; i++)
        {
            windowSum += cardPoints[i];
            windowSum -= cardPoints[i - windowSize];

            minSum = Math.min(minSum, windowSum);
        }

        return total - minSum;
    }
}