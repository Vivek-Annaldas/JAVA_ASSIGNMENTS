import java.io.*;

public class LogFileSummarizer {
    public static void main(String[] args) {
        int infoCount = 0, warnCount = 0, errorCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("app.log"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("INFO")) infoCount++;
                else if (line.startsWith("WARN")) warnCount++;
                else if (line.startsWith("ERROR")) errorCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log_summary.txt"))) {
            writer.write("Log File Summary Report\n");
            writer.write("-----------------------\n");
            writer.write("INFO messages: " + infoCount + "\n");
            writer.write("WARN messages: " + warnCount + "\n");
            writer.write("ERROR messages: " + errorCount + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Summary file 'log_summary.txt' created successfully!");
    }
}
