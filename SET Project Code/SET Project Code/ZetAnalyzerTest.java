

public class ZetAnalyzerTest
{
    public static void main(String[] args)
    {
        ZetCard c1= new ZetCard(1,1,1,1);
        ZetCard c2= new ZetCard(1,1,1,1);
        ZetCard c3= new ZetCard(1,1,1,1);
        if(ZetAnalyzer.isZet(c1,c2,c3))
        {
            System.out.println("isZet Works");
            
        }
        ZetCard[] z = new ZetCard[5];
        ZetCard c4= new ZetCard(1,2,2,3);
        ZetCard c5= new ZetCard(4,345,52,52);
        z[0]=c1;
        z[1]=c4;
        z[2]=c3;
        z[3]=c5;
        z[4]=c2;
        int[] i=new int[3];
        i=ZetAnalyzer.findZet(z);
        for(int j=0;j<i.length;j++)
        {
            System.out.println(i[j]+" ");
        }
        System.out.println("The above should print 0,2,4");
        
        
    }
    
}
