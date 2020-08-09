/**
* Class for a key-value
* pair entry
**/
public class EntryADTQueue {
    int key;//priority key
    String value;// entry value

    public EntryADTQueue(int key, String value)
    {
        this.key = key;
        this.value = value;
    }
/**
 * getKey
 * @brief gets the priority key of the entry
 * @return the priority key
 */
    public int getKey()
    {
        return this.key;
    }
    /**
     * getValue 
     * @brief gets the value of the entry
     * @return the value
     */
    public String getValue()
    {
        return this.value;
    }
    }