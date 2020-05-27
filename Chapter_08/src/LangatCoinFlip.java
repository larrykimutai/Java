import java.util.Random;

//create coin object
public class LangatCoinFlip {
    //field
    public LangatCoinFlip(){

    }

    //enumerated data type for Heads and Tails
    enum CoinSide {
        Heads{
            public String CoinSideHeads(){
                return "Heads";
            }
        },
        Tails{
            public String CoinSideTails(){
                return "Tails";
            }
        }}

    //static class to flip the coin
    public static CoinSide flipCoin(){
        Random flip = new Random();
        if (flip.nextInt(2) == 0){
            //System.out.println("Heads!");
            return CoinSide.Heads;}
            //else{
                //System.out.println("Tails!");
        //}
        return CoinSide.Tails;
    }
}
