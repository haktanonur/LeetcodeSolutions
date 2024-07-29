class Solution {
    public int maximumWealth(int[][] accounts) {
        int result = 0;
        for(int i=0; i<accounts.length; i++){
            int total = 0;
            for(int j=0; j<accounts[i].length; j++){
                total += accounts[i][j];
            }
            if(total >= result){
                result = total;
            }
        }
        return result;
    }
}
[[1,2,3],[3,2,1]]
