import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Grevil Lopes
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] suits = {"hearts", "spades", "clubs", "diamonds"};
        List<String> deck = new ArrayList<>();

        for (String suit : suits) {
            deck.add(suit + "-Ace");
            for (int i = 2; i <= 10; i++) {
                deck.add(suit + "-" + i);
            }
            deck.add(suit + "-Jack");
            deck.add(suit + "-Queen");
            deck.add(suit + "-King");
        }

        CardOperations deal = new CardOperations();
        deal.dealOneCard(deck);
    }

}
