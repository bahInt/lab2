import org.apache.hadoop.io.WritableComparable;

public class AiportWritableComparable implements WritableComparable<AiportWritableComparable> {
    private airportId;
    private dataIndex;

    protected getAirportId(){}
    protected getDataIndex(){}

    public AirportWritableComparable(){}

    @Override
    public int compareTo(AiportWritableComparable o) {
        
    }
}
