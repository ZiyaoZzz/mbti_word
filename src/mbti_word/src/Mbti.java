import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Mbti{
    public static void writeToCSV(ArrayList<String> timings){
        String fileName = "mbti_1.csv";
        try {
            StringBuilder csvContent = new StringBuilder();
            csvContent.append("sort_type,data_size,run_time\n");
            for (String timing : timings){
                csvContent.append(timing).append("\n");
            }
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(csvContent.toString());
            bufferedWriter.close();
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //这段code随便从之前的作业复制过来的，可能需要修改一下
}