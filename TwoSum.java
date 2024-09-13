class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int i,j;
        int[] res=new int[2];
        
        for(i=0;i<nums.length;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
                int sum = nums[i]+nums[j];
                if(sum==target)
                {
                   res[0]=i;
                    res[1]=j;
                    break;
                }
            }
        }
    return res;
    }
}