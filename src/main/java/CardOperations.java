
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Grevil Lopes
 */
public class CardOperations {
    private boolean shuffled = false;
    private Deque<String> shuffledDeck;
    int i=1;

    public CardOperations() {
    }

    public void shuffle(List deck) {    
        Collections.shuffle(deck);
        shuffledDeck = new ArrayDeque<String>(deck);
        
    }

    public void dealOneCard(List deck) {
        if(shuffled == false){
        shuffle(deck);
        shuffled = true;
        }
//        System.out.println(shuffledDeck);

while(shuffledDeck.isEmpty() == false){
    
        System.out.println(i + " " + shuffledDeck.pop());
        i++;
        dealOneCard(deck);
}
    }

}
