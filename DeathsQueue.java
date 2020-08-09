import java.util.Objects;

public class DeathsQueue implements Comparable<DeathsQueue> {

    private String date;
    private int numdeaths;
    
    public DeathsQueue(String date, int numdeaths) {
        this.date = date;
        this.numdeaths = numdeaths;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int geNumdeaths() {
        return numdeaths;
    }

    public void setNumdeaths(int numdeaths) {
        this.numdeaths = numdeaths;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeathsQueue deaths = (DeathsQueue) o;
        return Integer.compare(deaths.numdeaths, numdeaths) == 0 && Objects.equals(date, deaths.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, numdeaths);
    }

    @Override
    public String toString()  {
        return "DeathsQueue{" +
                "date='" + date + '\'' +
                ", numdeaths=" + numdeaths +
                '}';
    }

    @Override
    public int compareTo(DeathsQueue cases) {
        if(this.geNumdeaths() < cases.geNumdeaths()) {
            return 1;
        } else if (this.geNumdeaths() > cases.geNumdeaths()) {
            return -1;
        } else {
            return 0;
        }
    }

}