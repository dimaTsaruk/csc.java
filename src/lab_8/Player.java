package lab_8;

// solution of exercise 3.b on page 207 of Mayfield Lab Manual
public class Player
{
    private int Number;
    private int Hits;
    private int Walks;
    private int Outs;

    Player()
    {
        Number = Hits = Walks = Outs = 0;
    }

    public int getNumber()
    {
        return Number;
    }

    public int getHits()
    {
        return Hits;
    }

    public int getWalks()
    {
        return Walks;
    }

    public int getOuts()
    {
        return Outs;
    }

    public void setNumber(int n)
    {
        Number = n;
    }

    public void setHits(int h)
    {
        Hits = h;
    }

    public void setWalks(int w)
    {
        Walks = w;
    }

    public void setOuts(int o)
    {
        Outs = o;
    }

    // overload for output
    public String toString()
    {
        String s = new String();

        s = String.format("%2d",Number) + "\t" +
                String.format("%2d",Hits) + "\t" +
                String.format("%2d",Walks) + "\t" +
                String.format("%2d",Outs);
        return s;
    }

} // end of the class
