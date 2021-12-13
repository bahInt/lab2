import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AiportWritableComparable implements WritableComparable<AiportWritableComparable> {
    private IntWritable airportId;
    private IntWritable dataIndex;

    protected getAirportId(){}
    protected getDataIndex(){}

    public AirportWritableComparable(){}

    @Override
    public void write(DataOutput dataOutput) throws IOException {
        airportId.write(dataOutput);
        airportId.write(dataOutput);
    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {
        airportId.readFields(dataInput);
        dataIndex.readFields(dataInput);
    }

    @Override
    public int compareTo(AiportWritableComparable o) {
        int compareAirportId =
    }
}
