package lab2;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class AirportGroupingComparator extends WritableComparator {
    protected  AirportGroupingComparator() {
        super(AirportWritableComparable.class, true);
    }

    @Override
    public int compare(AirportWritableComparable first, AirportWritableComparable second) {
        AirportWritableComparable fistAirportID = (AirportWritableComparable) first;
        AirportWritableComparable secondAirportID = (AirportWritableComparable) second;

        return fistAirportID.getAirportId().compareTo(secondAirportID.getAirportId());
    }
}
