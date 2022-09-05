import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
// Importing List class from java.util package
import java.util.List;

// Main class
public class FileReader {
    // Java Program to Extract Content From a Text Document
// Using Files class



        // To read the file using class
        private static void readUsingClass(String fileName)
                throws IOException
        {
            // Creating an object of Path class
            Path path = Paths.get(fileName);

            // To read file to byte array
            byte[] bytes = Files.readAllBytes(path);

            // Display message only
            System.out.println(
                    "Read text file using Files class");

            // Reading the file to String List
            @SuppressWarnings("unused")

            // Creating a List class object of string type
            // as data in file to be read is words
            List<String> allLines = Files.readAllLines(
                    path, StandardCharsets.UTF_8);
            System.out.println(new String(bytes));
        }

        // Method 2
        // Main driver method
        public static void main(String[] args)
                throws IOException
        {
            // Custom input directory passed where text
            String fileName
                    = "/Users/mac/Desktop/EP720N.TXT";

            // read using FileReader, no encoding support, not
            // efficient
            readUsingClass(fileName);
        }
    }
