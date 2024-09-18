class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;

        if( target <= nums[0]){
            return 0;
        }
        
        for(int i = 0; i<len; i++){
            if(target == nums[i]){
                return i;
            }else{
                if(i<len-1){
                    if(target > nums[i] && nums[i+1] > target){
                        return i + 1;
                    }
                }
            }
        }
    return len;
    }
}