package lab2;

import org.apache.hadoop.mapreduce.Job;

public class JobApp {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.err.println("Usage: App <input path> <output path>");
            System.exit(-1);
        }
        Job job = Job.getInstance();
        job.setJarByClass(JobApp.class);
    }
}
