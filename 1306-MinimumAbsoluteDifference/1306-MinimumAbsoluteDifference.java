// Last updated: 7/9/2026, 9:46:59 AM
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) 
    {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        List<List<Integer>> result=new ArrayList<>();
        for(int i=1;i<arr.length;i++)
        {
            int diff=arr[i]-arr[i-1];
            min=Math.min(min,diff);

        }
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]-arr[i-1]==min)
            {
                result.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return result;
        
    }
}