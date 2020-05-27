//score based game or turn based game
public class LangatPlayer {
    //fields
    private int Score[];
    private String Name[];
    private int[] ArrayScore;
    private String[] Choice;


    //constructor
    public LangatPlayer(String names[]){
        Score = new int [names.length];
        Name = new String [names.length];
        ArrayScore = new int [names.length];
    }

    //Name constructor
    public LangatPlayer(String name[], String choices[]){
        Name = name;
        Choice = choices;
    }


    //choice constructor
    public LangatPlayer(String choice[], boolean dummy){
        Choice = choice;
    }


    public String getPlayerChoice(String choice){
        return choice;
    }


    //create setter to change score
    public void setArrayScore(int[] dummy, int[] dummy2, int[] score) {
        if (dummy == null && dummy2 == null && score == null){
            for (int i = 0; i < score.length; i ++){
                ArrayScore[i] = 0;}
        }
        else if (score[0] == 0){
            for (int i = 0; i < score.length; i ++){
                getArrayScore();
                ArrayScore = score;
                }
        }
        else {
            for (int i = 0; i < score.length; i ++){
                ArrayScore[i] = score[i];
            }
        }
    }
    public int[] getArrayScore(){
        return ArrayScore;
    }

    //create name getter
    public String getName(int person){
        return Name[person];
    }

    //create name setter
    public void setName(String name[]){
        Name = name;
    }

}
