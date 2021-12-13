import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.IOException;

public class AiportWritableComparable implements WritableComparable<AiportWritableComparable> {
    private airportId;
    private dataIndex;

    protected getAirportId(){}
    protected getDataIndex(){}

    public AirportWritableComparable(){}

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
