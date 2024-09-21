class Solution {
    public int removeDuplicates(int[] nums) {
        
        int len = nums.length;
        int [] arraynew = new int[len];
        int index = 0;

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                index++;
                nums[index] = nums[i];
            }
        }
    return index + 1;
    }
}