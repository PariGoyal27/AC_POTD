package day_21;
//https://leetcode.com/problems/water-bottles/

public class WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drank = numBottles; 

        while(numBottles >= numExchange){
            int newBottles = numBottles / numExchange; // 15/4 = 3,  6/4 = 1
            drank += newBottles; // 15 + 3 = 18,  18+1 = 19
            numBottles = newBottles + (numBottles % numExchange); // 3 + 15%4 = 6, 1 + 6%4 = 3
        }
        return drank;
    }
}
