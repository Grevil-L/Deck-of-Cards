
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] suites = {"hearts", "spades", "clubs", "diamonds"};
        List<String> deck = new ArrayList<String>();
        
        for(String suit: suites){
            deck.add(suit + "-Ace"); 
            for(int i=2; i<=10; i++){
                deck.add(suit + "-" + i);
            }
            deck.add(suit + "-Jack");
            deck.add(suit + "-Queen");
            deck.add(suit + "-King");
            
            
            
        }
        System.out.println(deck);


    }

}

