/**
 * PriorityQueueADTArray
 * @brief a priority queue made using the array data structure
 */
public class PriorityQueueADTArray
{

    int capacity;// maximum number of entries
    EntryADTQueue[] data;// the list of entries
    int size; //the current amount of entries

    public PriorityQueueADTArray(int capacity)
    {
        this.capacity = capacity;
        this.size = 0;
        data = new EntryADTQueue[capacity];
    }

    /**
     * isFul
     * @brief determines if the queue is currently full
     * @return true if full, false if not
     */
    public boolean isFull()
    {
        return (size == capacity);
    }
    /**
     * isEmpty
     * @brief determines wheter the queue is emtpy or not
     * @return true if full, false if not
     */
    public boolean isEmpty() 
    {
        return(size ==0);
    }
    /**
     * enqueue
     * @brief adds a new entry to the queue
     * @param key the priority of the entry
     * @param value the value of the entry
     */
    public void enqueue(int key, String value)
    {
        ComparatorADT com = new ComparatorADT();//create a compartor to determine where to put the entry
        if (isFull()) //check if queue full
        {
            System.out.println("Queue is Full.");
        }
        else if(isEmpty())// if queue empty, no need to compare, just add the entry
        {
            EntryADTQueue inf = new EntryADTQueue(key, value);
            data[0] = inf;
            this.size++;
        }
        else if(this.size == 1)// if on the second entry just compare with the only other entry in the queue
        {
            if(com.compare(key, data[0].getKey()) < 0 || com.compare(key, data[0].getKey()) == 0)
                {//if new entry has higher priority push the first entry back
                    EntryADTQueue temp = data[0];
                    EntryADTQueue in = new EntryADTQueue(key, value);
                    data[0] = in;
                    data[1] = temp;
                    this.size++;
                }
                else
                {
                    //if new entry has lower priotity just add it to the end
                    EntryADTQueue in = new EntryADTQueue(key, value);
                    data[1] = in;
                    this.size++;
                }

        }
        else
        {
            //this is the case for all other entries
            int i =0;
            boolean add = false;// create a boolean to determine if a place was found for the entry
            for( i = 0;i < this.size;i++)// loop through all entries and compare to see if the new entry has higher priority than one present in the queue already
            {
                if(com.compare(key, data[i].getKey()) < 0 || com.compare(key, data[i].getKey()) == 0)
                {
                    //if new entry has higher priority than the ith element, insert the new entry 
                    for(int j = this.size ;j > i;j--)
                    {
                        data[j] = data[j-1];
                    }
                    EntryADTQueue in = new EntryADTQueue(key, value);
                    data[i] = in;// inserting the new entry
                    this.size++;
                    add = true;
                    break; //break since we found a spot for the entry
                }
                
            }
            if(!add)// if a spot wasnt found then the new entry must be lower priority than any entry already in the list
            {
                EntryADTQueue in = new EntryADTQueue(key, value);
                data[this.size] = in;// just add the new entry to the end
                this.size++;
            }
            
            

        }
    }

    /**
     * dequeue
     * @brief removes and returns the entry at the top of the queue (the highest priority)
     * @return the top entry
     */
    public EntryADTQueue dequeue()
    {
        if(this.isEmpty())// if queue is empty there is nothing to return
        {
            return null;
        }
        else
        {
            EntryADTQueue ret = data[0];// store first element 
            for(int i = 0;i < this.size-1;i++)
            {
                data[i] = data[i+1];// shift everything forward
            }
            this.size--;//reduce size
            return ret;//return stored entry
        }
        
    }

    /**
     * size
     * @brief gets the current size of the queue
     * @return the size
     */
    public int size()
    {
        return this.size;
    }
    /**
     * peek
     * @brief shows the first entry of the queue without changing the queue
     * @return the value of the entry
     */
    public EntryADTQueue peek()
    {
        if (isEmpty())
            return null;
        else
            return data[0];
    }
    /**
     * display
     * @brief prints out the contents of the priority queue
     */
    public void display()
    {
        for(int i = 0;i < this.size;i++ )// go through each entry
        {
            System.out.println("Entry "+i+" : "+data[i].getValue()+" Priority: "+data[i].getKey());

        }
        System.out.println("\n");
    }
}