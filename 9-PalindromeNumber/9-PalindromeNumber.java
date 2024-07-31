class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
[
[1,1,2]
[0,0,1,1,1,2,2,3,3,4]
[1,2]
[0,1,2,3,4]
[1,2]
[0,1,2,3,4]
