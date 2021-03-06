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
            float sumDelays = 0.f;
            int amountOfValues = 0;
            float iterDelay;
            while(iter.hasNext()) {
                try {
                    iterDelay = Float.parseFloat(iter.next().toString());
                    if(minDelay > iterDelay) {
                        minDelay = iterDelay;
                    }
                    if(maxDelay < iterDelay) {
                        maxDelay = iterDelay;
                    }
                    
                    sumDelays += iterDelay;
                    amountOfValues++;
                }
                catch (NumberFormatException ignored) {}
            }
            float averageDelay = sumDelays / amountOfValues;

            Text outputKey = new Text("\nAirport Name: " + airportName);
            Text outputValue = new Text("\nMinimal Delay: " + minDelay
                                    + "\nMaximal Delay:  " + maxDelay
                                    + "\nAverage Delay: " + averageDelay);
            context.write(outputKey, outputValue);
        }
    }
}
