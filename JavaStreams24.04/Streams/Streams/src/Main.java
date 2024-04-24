import java.io.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String path = "H:\\input.txt";
        String outputPath = "H:\\output.txt";

        {
            try {
                FileReader reader = new FileReader(path);
                BufferedReader buffReader = new BufferedReader(reader);

                FileWriter writer = new FileWriter(outputPath);
                BufferedWriter buffWriter = new BufferedWriter(writer);

                String line = buffReader.readLine().toUpperCase();
                while (line != null) {
                    buffWriter.write(line.toUpperCase());
                    buffWriter.newLine();
                    line = buffReader.readLine();
                }
                buffReader.close();
                buffWriter.close();


            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

/*import java.io.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String path = "H:\\input.txt";
        String outputPath = "H:\\output.txt";

        {
            try {
                FileReader reader = new FileReader(path);
                BufferedReader buffReader = new BufferedReader(reader);

                FileWriter writer = new FileWriter(outputPath);
                BufferedWriter buffWriter = new BufferedWriter(writer);

                String line = buffReader.readLine().toUpperCase();
                while (line != null) {
                    buffWriter.write(line.toUpperCase());
                    buffWriter.newLine();
                    line = buffReader.readLine();
                }
                buffReader.close();
                buffWriter.close();


            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}*/