import java.util.Random;

public class LangatFlipTheCoin {
    //fields
    private String Choice = "";


    //flip the coin getter
    public String getCoinSide(){
        Random flip = new Random();
        int coinSide = flip.nextInt(2);
        if(coinSide == 0){
            Choice = "heads";
            return Choice;
        }
        else if(coinSide == 1)
            Choice = "tails";
            return  Choice;
    }

}
