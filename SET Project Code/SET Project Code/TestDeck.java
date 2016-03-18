public class TestDeck{
    public static void main(String[]args){
        Deck deck=new Deck();
        deck.add(new Card(666));
        deck.add(new Card(420));
        System.out.println(deck.toString()+"\n");
        deck.shuffle();
        System.out.println(deck.toString()+"\n");
        deck.sort();
        System.out.println(deck.toString()+"\n");
        for(int x=0;x<deck.getNumCards();x++)
            System.out.println((deck.takeTop()).toString());
    }
}