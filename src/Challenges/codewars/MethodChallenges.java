package Challenges.codewars;

public class MethodChallenges {
    // The first method should be names displayHighScorePosition.
    // this Method should have two parameters, one for player's name, and one for a player's position in high score list
    // This method should print a message like "Tim managed to get into position 2 on the high score list "

    // The second method should be named calculateHighScorePosition.
    // the method should have only one parameter, the player's score.
    // this method should return a number between 1 and 4, based on the score values shown in this table

    // Score -------------------------------------------------- Result
    // Score greater than on equal to 1000 -------------------- 1
    // Score greater than or equal to 500 but less than 1000 -- 2
    // Score greater than or equal to 100 but less than 500 --- 3
    // All other scores --------------------------------------- 4

    // Finally, call both methods and display the result for the following scores : 1500, 1000, 500, 100 and 25.

    public static void main(String[] args) {
        // region PLAYER'S SCORE
        final int scorePlayerOne = 1500;
        final int scorePlayerTwo = 1000;
        final int scorePlayerTree = 500;
        final int scorePlayerFour = 100;
        final int scorePlayerFive = 25;
        //  endregion

        int playerPosition;

        // region Solving challenge

        // scorePlayerOne
        playerPosition = calculateHighScorePosition(scorePlayerOne);
        displayHighScorePosition("Diego", playerPosition);

        // scorePlayerTwo
        playerPosition = calculateHighScorePosition(scorePlayerTwo);
        displayHighScorePosition("Juan", playerPosition);

        // scorePlayerTree
        playerPosition = calculateHighScorePosition(scorePlayerTree);
        displayHighScorePosition("Jose", playerPosition);

        // scorePlayerFour
        playerPosition = calculateHighScorePosition(scorePlayerFour);
        displayHighScorePosition("Pedro", playerPosition);

        // scorePlayerFive
        playerPosition = calculateHighScorePosition(scorePlayerFive);
        displayHighScorePosition("Mario", playerPosition);

        // endregion

    }

    // region calculate High Score Position
    public static  int calculateHighScorePosition(int score){

        // region SCORES

        final int scoreCheckPointHigh = 1000;
        final int scoreCheckPointMedium = 500;
        final int scoreCheckPointLow = 100;

        // endregion

        int result = 4;
            if(score >=  scoreCheckPointHigh ){
                result = 1;
            }
            else if( score >= scoreCheckPointMedium){
                result = 2;
            }
            else if (score >= scoreCheckPointLow ){
                result = 3;
            }
        return result;
    }
    // endregion

    // region display High Score Position
    public static void  displayHighScorePosition(String name, int position){
        System.out.println("Player : " + name + " - " + "achieved position: " + position);
    }

    // endregion
}
