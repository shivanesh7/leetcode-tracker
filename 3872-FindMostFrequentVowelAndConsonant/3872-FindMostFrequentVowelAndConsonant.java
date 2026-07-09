// Last updated: 7/9/2026, 9:45:35 AM
class Solution {
    public int maxFreqSum(String s) {
        
        int freq1[] = new int[123]; 
        int freq2[] = new int[123];
        
        int max1 = 0;
        int max2 = 0;
        
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                freq1[ch]++;
                max1 = Math.max(max1, freq1[ch]);  // ✅ FIXED
            }
            else
            {
                freq2[ch]++;
                max2 = Math.max(max2, freq2[ch]);
            }
        }
        
        return max1 + max2;
    }
}