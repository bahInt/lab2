package lab2;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

public class JoinReducer extends Reducer<AirportWritableComparable, Text, Text, Text> {
    @Override
    protected void reduce(AirportWritableComparable key, Iterable<Text> value, Context context) throws IOException, InterruptedException {
        Iterator<Text> iter = value.iterator();
        Text airportName = new Text(iter.next().toString());

        if(iter.hasNext()) {
            float minDelay = Float.MAX_VALUE;
            float maxDelay = Float.MIN_VALUE;
            float sum = 0.f;

            while(iter.hasNext()) {
                Text value = iter.next();

            }
        }
    }
}
