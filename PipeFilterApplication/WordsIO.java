package PipeFilterApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
}
