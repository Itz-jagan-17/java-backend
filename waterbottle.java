class waterbottle {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while (numBottles>=numExchange){
            int newBottles=numBottles/numExchange;
            int remBottles=numBottles % numExchange;
            numBottles=newBottles+remBottles;
            ans = ans+ newBottles;

        }
        return ans;
    }
}
