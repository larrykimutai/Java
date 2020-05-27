import javax.swing.*;

//flip coin and keep number of heads and tails

public class LangatFlipCoin {
    public static void main(String[] args){
        int numHeads = 0, numTails, numFlip;
        String input;

        input = JOptionPane.showInputDialog
                ("How many times do you want to flip the coin? ");
        numFlip = Integer.parseInt(input);

        //did not create a Coin object, but instead called on static fields
        //numFlip = keyboard.nextInt();
        for(int i = 0; i < numFlip; i++) {
            if (LangatCoinFlip.flipCoin().equals(LangatCoinFlip.CoinSide.Heads)) {
                numHeads++;
            }
        }
            numTails = numFlip - numHeads;

            //display results
            System.out.println("Coin flips: " + numFlip);
            System.out.println("Number of Heads: " + numHeads);
            System.out.println("Number of Tails: " + numTails);
        }
    }
