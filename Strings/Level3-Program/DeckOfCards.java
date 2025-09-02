import java.util.Scanner;

public class DeckOfCards {
    private static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] ranks = {
        "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "Jack", "Queen", "King", "Ace"
    };
    public static String[] initializeDeck() {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int)(Math.random() * (n - i));
    
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }
    public static String[][] distributeCards(String[] deck, int n, int x) {
        if (n % x != 0) {
            System.out.println("Cards cannot be distributed equally among players!");
            return null;
        }

        int cardsPerPlayer = n / x;
        String[][] players = new String[x][cardsPerPlayer];

        int index = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[index++];
            }
        }
        return players;
    }
    public static void printPlayers(String[][] players) {
        if (players == null) return;

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("   " + players[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] deck = initializeDeck();
        shuffleDeck(deck);

        System.out.print("Enter number of cards to distribute: ");
        int n = sc.nextInt();

        System.out.print("Enter number of players: ");
        int x = sc.nextInt();

        String[][] players = distributeCards(deck, n, x);

        printPlayers(players);

        sc.close();
    }
}
