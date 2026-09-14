//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    boolean gameOver = false;
    int score = 10000;
    int levelCompleted = 8;
    int bonus = 200;

    int finalScore = score;

    if(gameOver) {
        finalScore += (levelCompleted * bonus);
        IO.print("Your score was " + finalScore);
    }else{
        IO.print("Your score was " + finalScore);
    }
}
