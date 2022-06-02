package Lab10;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class FileMethods {

    // Ex1
    // This method converts file content to list of strings
    public static void fileContentToList(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input;
            while ((input = reader.readLine()) != null) {
                List<String> contentToList = Arrays.asList(input.split("\\. "));
                System.out.println(contentToList);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    // Ex2
    // This method writes to a file a given sentence
    public static void writeToFile(String sentence, File file) {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(sentence);
            System.out.println("Done!");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    // Ex3
    // This method is joining two files into a new one
    public static void concatTwoFiles(File firstFile, File secondFile, File targetFile) {
        try (BufferedReader firstReader = new BufferedReader(new FileReader(firstFile));
             BufferedReader secondReader = new BufferedReader(new FileReader(secondFile));
             FileWriter writer = new FileWriter(targetFile, true)) {

            // Reading and writing the first file
            String input;
            while ((input = firstReader.readLine()) != null) {
                writer.write(input);
            }

            writer.append("\n");

            // Reading and writing the second file
            while ((input = secondReader.readLine()) != null) {
                writer.write(input);
            }

            System.out.println("Done!");
        } catch (IOException e) {
            System.err.println("Error " + e.getMessage());
        }
    }

    // Ex4
    // This method replaces all but numbers and letters with $
    public static void replaceWithDollar(File file) {
        File tempFile = new File("files/temp.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             FileWriter writer = new FileWriter(tempFile)) {
            String input;
            while ((input = reader.readLine()) != null) {
                writer.write(input.replaceAll("[^0-9a-zA-Z]", "\\$"));
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        file.delete();
        tempFile.renameTo(file);
        System.out.println("Done!");
    }
}
