package lab2;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class AirportPartitioner extends Partitioner<AirportWritableComparable, Text> {

    @Override
    public int getPartition(AirportWritableComparable airportWritableComparable, Text text, int numberOfReducers) {
        return (airportWritableComparable.getAirportId().hashCode() & Integer.MAX_VALUE) % numberOfReducers;
    }
}
