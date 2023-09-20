package PipeFilterApplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WordsIO {


    public static String readWords(String urlString){

         // Initialize a StringBuilder to store the contents of the file
        StringBuilder content = new StringBuilder();

        try {
            // Open the file using a FileReader and wrap it in a BufferedReader for efficient reading
            BufferedReader reader = new BufferedReader(new FileReader(urlString));

            String line;
            // Read each line from the file and append it to the StringBuilder
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n"); // You can change "\n" to "\r\n" for Windows line endings
            }

            // Close the BufferedReader when done
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convert the StringBuilder content to a String
        String fileContent = content.toString();

        // Print or use the file content as needed
        System.out.println("Read succeed File Content:\n" + fileContent);

        return fileContent;
    }


    public static void writeWords(List<String> outputList, String outputPath){

        String filePath = "output.txt";
         try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Iterate through the list and write each string to the file
            for (String str : outputList) {
                writer.write(str);
                writer.newLine(); // Add a newline to separate the strings
            }
            System.out.println("List written to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
