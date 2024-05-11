package MasterClass;

public class MethodOverloading {
    // method overloading occurs when a class has multiple method with the same name, but the method are declared with different parameters
    // So you can execute multiple methods with the same name, but cal it with different arguments
    // Java can resolve which method it needs to execute based on the arguments being passed when the method is invoked

    public static void main(String[] args) {
    int newScore =     calculateScore("Tim", 500);
    System.out.println("New Score "  + newScore);
    calculateScore(500);
    calculateScore();
    }




    public static int calculateScore ( String playerName, int score){
        System.out.println("Player " + playerName + " Scored " + score);
        return score * 100;
    }

     public static int calculateScore (  int score){
       return calculateScore("No name", score);
    }

    private static void calculateScore() {
        System.out.println("No player, no score");
    }

}
