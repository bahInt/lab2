import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class AirportMapper extends Mapper<LongWritable, Text, AirportWritableComparable, Text> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String[] line = value.toString().split(",[\"]");
        if(key.get() != 0){
            String airportCodeId = line[0].replace("\"","");
            int airportCode = Integer.parseInt(airportCodeId);
            context.write(
                    new AirportWritableComparable(
                            new IntWritable(airportCode),
                            new IntWritable()

            );
        }
    }
}
