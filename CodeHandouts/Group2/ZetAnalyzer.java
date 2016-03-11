/**
 *  Provides static methods for finding sets.
 */

/*

  Tips:

  - Given a, b, c from {1, 2, 3}, they are all equal or all different if and only if
    (a + b + c) % 3 == 0.  This property can be used for testing three cards for a set
    easily.

    (For more mathematically inclined, the SET deck corresponds to the 4-dimensional vector
    space over the algebraic field {0, 1, 2} with modulo 3 arithmetic.  Three cards form a "set"
    if and only if the sum of the corresponding vectors is 0.)

  - isZet and findZet are static methods.

  - in isZet, don't forget to check that the cards are not all the same.

  - Note that an array passed to findZet can have nulls in some of the elements.

*/

public class ZetAnalyzer
{
  
  
  // Constructor
  public ZetAnalyzer()
  {
    
  }
  
  public static boolean isZet(ZetCard card1, ZetCard card2, ZetCard card3)
  {
    // Input Card Array
    ZetCard[] cards = new ZetCard[3];
    cards[0] = card1;
    cards[1] = card2;
    cards[2] = card3;
    
    /*=================================================== SHAPE CHECKER ============================================================*/
    boolean shapeState = false;
    
      // Checks if all shapes are the Same and returns TRUE if so and then checks if all shapes are different and returns TRUE if so
      
      if(cards[0].getShape() == cards[1].getShape() && cards[1].getShape() == cards[2].getShape() && cards[0].getShape() == cards[2].getShape())
      {
        shapeState = true;
      } else if(cards[0].getShape() != cards[1].getShape() && cards[1].getShape() != cards[2].getShape() && cards[0].getShape() != cards[2].getShape())
      {
        shapeState = true;
      }
    
    /*=================================================== FILL CHECKER ============================================================*/
    boolean fillState = false;
    
      // Checks if all fills are the Same and returns TRUE if so and then checks if all fills are different and returns TRUE if so
      
      if(cards[0].getFill() == cards[1].getFill() && cards[1].getFill() == cards[2].getFill() && cards[0].getFill() == cards[2].getFill())
      {
        fillState = true;
      } else if(cards[0].getFill() != cards[1].getFill() && cards[1].getFill() != cards[2].getFill() && cards[0].getFill() != cards[2].getFill())
      {
        fillState = true;
      }
    
    /*=================================================== NUMBER CHECKER ============================================================*/
    boolean numberState = false;
    
      // Checks if all number of shapes are the Same and returns TRUE if so and then checks if all number of shapes are the Same and returns TRUE if so
      if(cards[0].getNumber() == cards[1].getNumber() && cards[1].getNumber() == cards[2].getNumber() && cards[0].getNumber() == cards[2].getNumber())
      {
        numberState = true;
      } else if(cards[0].getNumber() != cards[1].getNumber() && cards[1].getNumber() != cards[2].getNumber() && cards[0].getNumber() != cards[2].getNumber())
      {
        numberState = true;
      }

    /*=================================================== COLOR CHECKER ============================================================*/
    boolean colorState = false;
    
      // Checks if all colors are the Same and returns TRUE if so and then checks if all the colors are the Same and returns TRUE if so
      if(cards[0].getColor() == cards[1].getColor() && cards[1].getColor() == cards[2].getColor() && cards[0].getColor() == cards[2].getColor())
      {
        colorState = true;
      } else if(cards[0].getColor() != cards[1].getColor() && cards[1].getColor() != cards[2].getColor() && cards[0].getColor() != cards[2].getColor())
      {
        colorState = true;
      }
      
    /*======================================================= FINAL RETURN STATEMENTS ==================================================*/
    
    if(shapeState == true && fillState == true && numberState == true && colorState == true) {
      return true;
    } else {
      return false;
    }
    
  }
  
  public static int[] findZet(ZetCard[] cards)
    {
        int [] a = new int [3];

        for(int i=0; i<cards.length();i++)//first candidate card
        {

            for(int j=i+1;j<cards.length();j++)//second candidate card
            {
                for(int k=j+1;k<cards.length();k++)//third candidate card
                {
                    if(isZet(cards[i],cards[j],cards[k]))
                    {
                                    a[0]=i;
                                    a[1]=j;
                                    a[2]=k;
                                    k=cards.length();
                                    j=cards.length();
                                    i=cards.length();
                     }
                                  }
                                }

                            }
         return a;

     }

  }
                 
           