import java.io.*;

public class FileWriteRead {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("demo.txt");
            fw.write("Hello Sakshi! Welcome to File Handling.");
            fw.close();
            System.out.println("File written successfully!");

            BufferedReader br = new BufferedReader(new FileReader("demo.txt"));
            String line;
            while ((line = br.readLine()) != null)
                System.out.println(line);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
