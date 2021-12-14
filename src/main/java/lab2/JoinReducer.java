package lab2;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

public class JoinReducer extends Reducer<AirportWritableComparable, Text, Text, Text> {
    @Override
    protected void reduce(AirportWritableComparable key, Iterable<Text> value, Context context) throws IOException, InterruptedException {
        Iterator<Text> iter = value.iterator();
        Text = new Text(iter.next);
        while(iter.hasNext()) {
            Text call = iter.next();
            Text outValue = new Text(call.toString() + "\t" + systeminfo.toString());
            context.write(key.getFirst(), outValue);
        }
    }
}
