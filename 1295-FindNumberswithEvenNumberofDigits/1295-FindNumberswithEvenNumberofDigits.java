class Solution {
    public int findNumbers(int[] nums) {
        int a = 0;
        for(int i=0; i<nums.length; i++){
            while(nums[i] != 0){
                nums[i] = nums[i]/10 ;
                count++;
            }
            if(count % 2 == 0){
                a++;
            }
        }
        return a;
    }
            int count = 0;
}
[
[12,345,2,6,7896]
[555,901,482,1771]
2
1
2
1
