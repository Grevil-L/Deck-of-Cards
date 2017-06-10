
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
/**
 *
 * @author Grevil Lopes
 */
/**
 * class in which operations are performed on deck of cards
 */
public class CardOperations {

    private boolean shuffled = false;
    private Deque<String> shuffledDeck;
    private int cardNumber = 1;

    /**
     * no argument constructor
     */
    public CardOperations() {
    }

    /**
     * This function shuffles cards
     *
     * @param deck is the deck of cards
     */
    public void shuffle(List deck) {
        Collections.shuffle(deck);
        shuffledDeck = new ArrayDeque<>(deck);

    }

    /**
     * This function deals a single card per iteration from shuffled cards
     *
     * @param deck is the deck of cards
     */
    public void dealOneCard(List deck) {
        if (shuffled == false) {
            shuffle(deck);
            shuffled = true;
        }

        while (shuffledDeck.isEmpty() == false) {

            System.out.println(cardNumber + " " + shuffledDeck.pop());
            cardNumber++;
            dealOneCard(deck);
        }
    }
}
