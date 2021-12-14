package lab2;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class JoinReducer extends Reducer<AirportWritableComparable, Text, Text, Text> {
    @Override
    protected void reduce() throws IOException, InterruptedException {
        
    }
}
