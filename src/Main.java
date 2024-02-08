public class Main {
    public static void main(String[] args) {
        int hp;
        int hpOne;
        Player playerOne = new Player();
        Player playerTwo = new Player("P_2", 4, 8, 12);
        Player playerThree = new Player("P_3", 5, 8, 1, 30, 2);
        hp = playerTwo.getHP();
        hpOne = playerOne.getHP();
        playerOne.attack(playerTwo, 15);

        System.out.println("playerTwo has had 15 damage dealt to them by playerOne!\nPlayer 2\nOriginal Health: " + hp);
        System.out.println("New Health: " + playerTwo.getHP());
        System.out.println("Player 1\nOriginal Health: " + hpOne);
        System.out.println("New Health: " + playerOne.getHP());

        System.out.println("\nplayerOne is currently " + playerOne.getDistance(playerThree) + " units away from playerThree!");

        System.out.println("\nplayerTwo current position: X" + playerTwo.getX() + ", Y " + playerTwo.getY() + ", Z " + playerTwo.getZ());
        playerTwo.move(2, 15);
        System.out.println("\nplayerTwo has moved to: X " + playerTwo.getX() + ", Y " + playerTwo.getY() + ", Z " + playerTwo.getZ());

        System.out.println("\nNow playerTwo is about to teleport to playerThree!");
        playerTwo.teleport(playerThree);
        System.out.println("\nplayerTwo has moved to: X " + playerTwo.getX() + ", Y " + playerTwo.getY() + ", Z " + playerTwo.getZ());
        System.out.println("\nplayerThree is at: X " + playerTwo.getX() + ", Y " + playerTwo.getY() + ", Z " + playerTwo.getZ());
    }
}