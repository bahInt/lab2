package lab2;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlightsMapper extends Mapper<LongWritable, Text, AirportWritableComparable, Text> {
    private static final int DEST_AIRPORT_ID = 14;
    private static final int DELAY_COLUMN_NUMBER = 18;
    private static final int TABLE_DESCRIPTION = 0;
    private static final int DATA_INDICATOR = 1;
    private static final String SPLIT_POINT = ",";

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String line = value.toString();
        String[] column = line.split(SPLIT_POINT);
        String destAirportIDString = column[DEST_AIRPORT_ID];

        if(key.get() > TABLE_DESCRIPTION){
            int destAirportID = Integer.parseInt(destAirportIDString);
            String destDelay = column[DELAY_COLUMN_NUMBER];
            if
            context.write(
                    new AirportWritableComparable(
                            new IntWritable(destAirportID),
                            new IntWritable(DATA_INDICATOR)
                    ),
                    new Text(destDelay)
            );
        }
    }
}
