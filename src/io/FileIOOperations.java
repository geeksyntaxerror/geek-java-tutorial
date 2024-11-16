package io;

import java.io.*;

public class FileIOOperations {
    public static void main(String[] args) {
        // File class operations
        fileClassOperations();

        // Reading and writing files (Byte-Level Operations)
        byteLevelFileOperations();

        // Reading and writing files (Character-Level Operations)
        characterLevelFileOperations();
    }

    // File class operations
    private static void fileClassOperations() {
        System.out.println("\n--- File Class Operations ---");

        File file = new File("example.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

        File directory = new File("exampleDir");
        if (directory.mkdir()) {
            System.out.println("Directory created: " + directory.getName());
        } else {
            System.out.println("Directory already exists or failed to create.");
        }

        // Check existence
        System.out.println("File exists: " + file.exists());
        System.out.println("Directory exists: " + directory.exists());
    }

    // Byte-level file operations
    private static void byteLevelFileOperations() {
        System.out.println("\n--- Byte-Level File Operations ---");

        String inputFile = "input.dat";
        String outputFile = "output.dat";

        try (FileOutputStream fos = new FileOutputStream(inputFile)) {
            fos.write("Byte-Level File Operations\n".getBytes());
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("Data successfully copied from " + inputFile + " to " + outputFile);
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }

    // Character-level file operations
    private static void characterLevelFileOperations() {
        System.out.println("\n--- Character-Level File Operations ---");

        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try (FileWriter fw = new FileWriter(inputFile)) {
            fw.write("Character-Level File Operations\n");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader(inputFile);
             FileWriter fw = new FileWriter(outputFile)) {
            int charData;
            while ((charData = fr.read()) != -1) {
                fw.write(charData);
            }
            System.out.println("Data successfully copied from " + inputFile + " to " + outputFile);
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}
