package MasterClass.Encapsulatio;

public class Main {

    public static void main(String[] args) {
//        var player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        player.health = 200;
//
//        player.loseHealth(11);
//        System.out.println("Remaining Health = " + player.healthRemaining());
        var player = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is = " + player.healthRemaining());

    }

}
