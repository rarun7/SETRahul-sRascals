public class ZetCard extends Card
{
    private int number, shape, fill, color;
    public ZetCard(int number, int shape, int fill, int color)
    {

        super(((number-1)*27+(shape-1)*9+(fill-1)*3+(color-1)));
        this.number=number;
        this.shape=shape;
        this.fill=fill;
        this.color=color;
    }

    public int getNumber()
    {
        return number;
    }

    public int getShape()
    {
        return shape;
    }

    public int getFill()
    {
        return fill;
    }
    public int getColor()
    {
        return color;
    }
    public String toString()
    {
        return super.toString() + "\n number is " + number + "\n shape is " + shape + "\n fill is " + fill + "\n color is " + color;
    }

} 