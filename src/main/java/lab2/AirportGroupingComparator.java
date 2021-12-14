package lab2;

import org.apache.hadoop.io.WritableComparator;

public static class AirportGroupingComparator extends WritableComparator {
    protected  AirportGroupingComparator() {
        super();
    }

    public int compare() {}
}
