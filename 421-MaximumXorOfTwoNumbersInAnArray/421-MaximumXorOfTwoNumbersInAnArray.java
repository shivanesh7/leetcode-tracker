// Last updated: 7/9/2026, 9:49:02 AM
class Solution {
    public int findMaximumXOR(int[] nums) {
        int max=0,mask=0;

        for(int i=31;i>=0;i--){
            mask|=(1<<i);

            Set<Integer> set=new HashSet<>();

            for(int num:nums)
                set.add(num&mask);

            int temp=max|(1<<i);

            for(int prefix:set){
                if(set.contains(prefix^temp)){
                    max=temp;
                    break;
                }
            }
        }

        return max;
    }
}