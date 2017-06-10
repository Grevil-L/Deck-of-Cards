
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
    private Deque<String> deque;

    public CardOperations() {
    }

    public void shuffle(List deck) {
//        deque = new ArrayDeque<String>(deck);
        Collections.shuffle(deck);
        
    }

    public void dealOneCard(List deck) {
        if(shuffled == false){
        shuffle(deck);
        shuffled = true;
        }
        System.out.println(deck);
    }

}
