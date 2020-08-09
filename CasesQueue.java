import java.util.Objects;

public class CasesQueue implements Comparable<CasesQueue> {

    private String date;
    private int numcases;
    
    public CasesQueue(String date, int numcases) {
        this.date = date;
        this.numcases = numcases;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumcases() {
        return numcases;
    }

    public void setNumcases(int numcases) {
        this.numcases = numcases;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CasesQueue cases = (CasesQueue) o;
        return Integer.compare(cases.numcases, numcases) == 0 && Objects.equals(date, cases.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, numcases);
    }

    @Override
    public String toString()  {
        return "CasesQueue{" +
                "date='" + date + '\'' +
                ", numcases=" + numcases +
                '}';
    }

    @Override
    public int compareTo(CasesQueue cases) {
        if(this.getNumcases() < cases.getNumcases()) {
            return 1;
        } else if (this.getNumcases() > cases.getNumcases()) {
            return -1;
        } else {
            return 0;
        }
    }

}