//CARD CLASS

public class Card implements Comparable<Card>
{
    private int id;
    public Card (int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }
    public boolean equals (Object other)
    {
        Card card = (Card) other;
        if (this.compareTo(card)==0)
            return true;
        return false;
    }
    public int compareTo (Card other)
    {
        if (this.id>other.getId())
        return 1;
        else if (this.id==other.getId())
        return 0;
        else
        return -1;
    }
    
    public String toString()
    {
        return ""+id;
    }
    
    
}