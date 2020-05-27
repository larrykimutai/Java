import javax.swing.*;

public class LangatCoinGame {
    public static void main(String[] args) {
        //get number of players and their names and store to array
        int names = getUserInput();
        String playerNames[] = getPlayerNames(names);

        CalculateScore(playerNames);

    }
    public static void CalculateScore(String[] names) {
        //get number of games to be played
        int numGames = numberOfGames();

        LangatPlayer defaultPlayerChoice = new LangatPlayer(names, true);

        //create objects
        LangatFlipTheCoin coin = new LangatFlipTheCoin();
        String[] defaultScore = getPlayerChoice(null);
        int[] PlayerScores = new int[names.length];
        LangatPlayer score1 = new LangatPlayer(names);
        LangatPlayer score2 = new LangatPlayer(names);


        for (int i = 0; i < numGames; i++) {

            //get players choices
            String[] choice = getPlayerChoice(names);

            /**
             loop this seperatly
             */

            //set choices elements == to number of players
            int[] finalPoint = new int[names.length];

            //flip the coin
            String coinSide = coin.getCoinSide();
            System.out.println(coinSide);
            System.out.println("~~~~~~~~");

            /**
             * do this before loop
             * and set defaultScore == finalScore
             */


            //calculate score for each round and print to console
            for (int in = 0; in < choice.length; in++) {
                //if players choices matches coin side up
                if (choice[in].toLowerCase().equals(coinSide)) {

                    //if(score1.getArrayScore() == null){
                    //    int test[] = new int[finalPoint.length];
                    //    test [0] = 2;
                    //    score1.setArrayScore(null,null, test);
                    // }
                    finalPoint[in] = score1.getArrayScore()[in] + 2;
                    int setElement[] = new int[finalPoint.length + 1];
                    setElement[in + 1] = score2.getArrayScore()[in];
                    setElement[in] = finalPoint[in];


                    score1.setArrayScore(null, null, setElement);

                    System.out.println(names[in] + " Gained 2 points: " + finalPoint[in]);
                }
                //if player choices does not match coin side up
                else
                    {
                    //if(score2.getArrayScore() == null){
                    //    int test[] = new int[finalPoint.length];
                    //    test [0] = -1;
                    //    score2.setArrayScore(null,null, test);
                    // }

                    finalPoint[in] = score2.getArrayScore()[in] - 1;
                    int setElement2[] = new int[finalPoint.length + 1];
                    setElement2[in + 1] = score1.getArrayScore()[in];
                    setElement2[in] = finalPoint[in];

                    score2.setArrayScore(null, null, setElement2);

                    System.out.println(names[in] + " Lost 1 point: " + finalPoint[in]);
                }
            }

            //print winner to console
            System.out.println();
           // for(int in = 0; in < names.length - 1; in++){
           //     if(finalPoint[in] < finalPoint[in + 1]){
           //         System.out.println("The Winner is " + names[i]);
            //    }
           // }
        }

            }




    public static String[] getPlayerChoice(String[] name){
        String[] Null = {null};
        if (name == null){
            return Null;
        }else {
            LangatPlayer player = new LangatPlayer(name, null);
            String choice[] = new String[name.length];
            for (int i = 0; i < name.length; i++) {
                choice[i] = askPlayerChoice(player.getName(i));
            }
            return choice;
        }
    }

    public static String askPlayerChoice(String i){
        return JOptionPane.showInputDialog(i + " pick Heads or Tails: ");
    }

    //get number of players playing
    public static int getUserInput() {
        String input = JOptionPane.showInputDialog
                ("How many players are playing ?");
        return Integer.parseInt(input);
    }



    //store names players into array

    public static String[] getPlayerNames(int name) {

        String[] nam = new String[name];
        for (int i = 0; i < name; i++) {
            String input = JOptionPane.showInputDialog
                    ("Name of player " + (i + 1));
            nam[i] = input;
        }
        return nam;
    }

    public static int numberOfGames(){
        String input = JOptionPane.showInputDialog
                ("How many rounds do you want to play? ");
        return Integer.parseInt(input);
    }

}

