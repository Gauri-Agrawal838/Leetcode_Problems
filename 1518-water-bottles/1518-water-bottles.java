class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        while(numBottles>=numExchange){
          int  f = numBottles/numExchange;
            sum = sum+f;
            numBottles = f+(numBottles%numExchange);
        }
        return sum;

    }
}