/**
 *  Represents a generic deck of cards.
 */

/*

Tips:

- Use an ArrayList<Card> to hold the cards.
- Add and remove cards at the end of the list.
- Use Collections.shuffle and Collections.sort to shuffle and sort the deck,
or write your own methods.  If you write your own, use selection sort
to sort and a similar algorithm to shuffle.  Use Math.random().
- In the toString method, separate strings for individual cards with "\n".

 */

import java.util.*;

public class ZetDeck extends Deck
{
    public ZetDeck(){
        for(int n = 1; n <= 3; n++){
            for(int s = 1; s <= 3; s++){
                for(int f = 1; f <= 3; f++){
                    for(int c = 1; c <= 3; c++){
                        this.add(new ZetCard(n, s, f, c));
                    } 
                }
            }
        }
    }
}
