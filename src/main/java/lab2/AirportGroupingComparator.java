package lab2;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public static class AirportGroupingComparator extends WritableComparator {
    protected  AirportGroupingComparator() {
        super(AirportWritableComparable.class, true);
    }

    @Override
    public int compare(AirportWritableComparable a1, AirportWritableComparable b1) {
        AirportWritableComparable fistAirportID = (AirportWritableComparable) first;
        AirportWritableComparable secondAirportID = (AirportWritableComparable) b1;

        return a.getFirst().compareTo(b.getFirst());
    }
}
