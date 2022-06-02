package Lab10;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("files/java.txt");
        FileMethods.fileContentToList(file);

        File outputFile = new File("files/world.txt");
        FileMethods.writeToFile("Hello, world!", outputFile);

        File targetFile = new File("files/target.txt");
        FileMethods.concatTwoFiles(file, outputFile, targetFile);

        FileMethods.replaceWithDollar(targetFile);
    }
}
