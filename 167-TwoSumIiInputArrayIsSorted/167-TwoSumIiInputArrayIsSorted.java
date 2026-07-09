// Last updated: 7/9/2026, 9:50:46 AM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[] = new int[2];

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {

                int result = numbers[i] + numbers[j];

                if(result == target) {
                    arr[0] = i + 1;
                    arr[1] = j + 1;
                    return arr;   // ✅ IMPORTANT: stop immediately
                }

                // ✅ optimization (since array is sorted)
                if(result > target) {
                    break;  // no need to check further j
                }
            }
        }
        return arr;
    }
}