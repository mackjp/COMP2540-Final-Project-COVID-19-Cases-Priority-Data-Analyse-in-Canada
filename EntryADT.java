public class EntryADT{
    private String date;
    private int numcase;
    private int numdeath;

    public EntryADT(String d,int i,int j)
    {
        this.date = d;
        this.numcase = i;
        this.numdeath = j;
    }

    public void setCase(int i)
    {
        this.numcase = i;
    }

    public void setDeath(int i)
    {
        this.numdeath = i;
    }

    public String getDate()
    {
        return this.date;
    }

    public int getCase()
    {
        return this.numcase;
    }

    public int getDeath()
    {
        return this.numdeath;
    }
}