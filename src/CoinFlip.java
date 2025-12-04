
public class CoinFlip {

    // constructor
    public CoinFlip() {}

    // this method simulates a coin flip by randomly returning "heads"
    // or "tails"; this method should return "heads" on average 50% of
    // the time and "tails" on average 50% of the time
    public String flip() {
        int Random = (int) (Math.random() * 2);
        if (Random == 1){
         return "heads";
        }
        return "tails";
    }

    // performs a simulation that flips a coin numFlips times
    // and returns the percent of those flips that were "heads";
    // this method should make use of your flip() method.
    // for example, if numFlips is 100, then this method should flip()
    // 100 times and track how many returned "heads"; if 46 were heads,
    // this method should return 0.46
    public double simulate(int numFlips) {
        int headcount = 0;
        for (int i = 0; i < numFlips;i++){
            if (flip().equals("heads")){
                headcount++;
            }
        }
        return ( (double)headcount / numFlips);
    }
}
