//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String playerName = "John";
        int playerPosition = 1;

        displayHighScorePosition(playerName, playerPosition);

        int playerScore = 555;
        int playerHighScorePosition = calculateHighScorePosition(playerScore);

        System.out.println("With a score of " + playerScore + ", the player managed to get into position " +
                playerHighScorePosition + " on the high score list!");
    }
    public static void displayHighScorePosition(String name, int position){

        System.out.println("Player " + name + " managed to get into position " + position +
                " on the high score list!");
    }

    public static int calculateHighScorePosition(int score){

        int highScorePosition;

        if (score >= 1000){
            highScorePosition = 1;
        }else if ((score >= 500) && (score < 1000)){
            highScorePosition = 2;
        }else if ((score >= 100) && (score < 500)){
            highScorePosition = 3;
        }else {
            highScorePosition = 4;
        }

        return  highScorePosition;
    }
}