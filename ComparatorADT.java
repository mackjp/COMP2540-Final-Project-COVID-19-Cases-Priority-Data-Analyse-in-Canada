/**
 * ComparatorADT
 * @brief a Comparator for working with priority queues
 */
public class ComparatorADT{
    /**
     * the main method of the Comparator
     * @param x the first elemtn to compare
     * @param y the second element to compare
     * @return -1 if x<y, 0 if x==y and 1 if x > y
     */
    public int compare(int x,int y)
    {
        int ret = 0;
        if(x > y)
        {
            ret = -1; 
        }
        else if(x < y)
        {
            ret = 1;
        }
        else if(x == y)
        {
            ret = 0;
        }
        return ret;
    }
}