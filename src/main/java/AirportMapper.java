import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class AirportMapper extends Mapper<LongWritable, Text, AirportWritableComparable, Text> {
    private static final int TABLE_DESCRIPTION = 0;
    private static final int AIRPORT_CODE_INDEX = 0;
    private static final int AIRPORT_NAME_INDEX = 1;

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String[] line = value.toString().split(",[\"]");
        if(key.get() != TABLE_DESCRIPTION){
            String airportCodeId = line[0].replace("\"","");
            int airportCode = Integer.parseInt(airportCodeId);
            String airportName = line[1].replace("\"","");
            context.write(
                    new AirportWritableComparable(
                            new IntWritable(airportCode),
                            new IntWritable(0) ),
                    new Text(airportName)
            );
        }
    }
}
