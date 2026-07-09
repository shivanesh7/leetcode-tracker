// Last updated: 7/9/2026, 9:51:21 AM
class Solution 
{
    public List<List<Integer>> subsets(int[] nums) 
    {
         List<List<Integer>> result =new ArrayList<>();
         backtrack(0,nums,new ArrayList<>(),result);
         return result;
    }
    void  backtrack(int index,int nums[],List<Integer>cur_arr,List<List<Integer>> result)
    {
      
      if(index==nums.length){ // base condition
        result.add(new ArrayList<>(cur_arr));
        return;
     }
      
      cur_arr.add(nums[index]); // Taken 
      backtrack(index+1,nums,cur_arr,result);
      
      cur_arr.remove(cur_arr.size()-1); // Not taken
      backtrack(index+1,nums,cur_arr,result);
    
    }
}