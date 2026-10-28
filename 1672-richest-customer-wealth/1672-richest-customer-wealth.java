class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealth = 0;
        for(int customer = 0; customer < accounts.length; customer++){
            int sum = 0;
            for(int account = 0;account < accounts[customer].length;account++){
                sum += accounts[customer][account];
            }
            if(sum > maxwealth){
                maxwealth = sum;
            }
        }
        return maxwealth;
        
    }
}