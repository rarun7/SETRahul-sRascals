

public class ZetTableTest
{
    public static void main(String[] args)
    {
        ZetTable z = new ZetTable();
        System.out.println(z.cardsInDeck());
        System.out.println(z.getOpenCard(1));
        if(z.enoughOpen())
        {
            System.out.println("Were ok m8");
        }
        else
        {
            System.out.println("We got a problem");
            
        }
        int[] i= new int[3];
           i=z.findZet();
           for(int j=0;j<i.length;j++)
           {
               System.out.println(i[j]+" ");
            }
            if(z.open3Cards())
        {
            System.out.println("Were ok m8");
        }
        else
        {
            System.out.println("We got a problem");
            
        }
        z.remove3Cards(i);
        z.compactOpenCards();
        System.out.println(z);
}
}
