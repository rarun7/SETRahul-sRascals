import java.util.*;
public class ZetDeck extends Deck
{
    public ZetDeck()
    {
        ArrayList<ZetCard> bubbles=new ArrayList<ZetCard>();
        for(int i=1; i<82; i++){
            ZetCard test=new ZetCard(i,i,i,i);
            bubbles.add(test);
        }
    }
}