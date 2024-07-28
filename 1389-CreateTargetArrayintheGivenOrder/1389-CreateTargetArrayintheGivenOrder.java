class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {        
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            arrayList.add(index[i], nums[i]);
        }
        int[] target = new int[arrayList.size()];
        for(int i=0; i<arrayList.size(); i++){
            target[i] = arrayList.get(i);
        }
        return target;
    }
}
[
[0,1,2,3,4]
[0,1,2,2,1]
[1,2,3,4,0]
[0,1,2,3,0]
[1]
[0]
[0,4,1,3,2]
[0,1,2,3,4]
[1]
[0,4,1,3,2]
[0,1,2,3,4]
[1]
