package lab2;

import org.apache.hadoop.io.WritableComparator;

public static class AirportGroupingComparator extends WritableComparator {
    protected  AirportGroupingComparator() {
        super(AirportWritableComparable.class, true);
    }

    public int compare() {}
}
