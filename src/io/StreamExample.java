package io;

import java.io.*;

public class StreamExample {

    public static void main(String[] args) {
        // File paths for byte and character stream examples
        String byteSourceFile = "resource/monkey.png";    // Example binary file (image)
        String byteDestinationFile = "resource/out/outputBinaryFile.jpg";
        String charSourceFile = "resource/inputTextFile.txt";      // Example text file
        String charDestinationFile = "resource/out/outputTextFile.txt";

        // Byte Stream Example
        copyBinaryFile(byteSourceFile, byteDestinationFile);
        System.out.println("Binary file copied successfully.");

        // Character Stream Example
        copyTextFile(charSourceFile, charDestinationFile);
        System.out.println("Text file copied successfully.");
    }

    // Byte Stream method to copy a binary file
    public static void copyBinaryFile(String source, String destination) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            int data;
            // Reading and writing one byte at a time
            while ((data = fis.read()) != -1) {
//                System.out.print(data +" ");
                fos.write(data);
            }

        } catch (IOException e) {
            System.out.println("Error during byte stream operation: " + e.getMessage());
        }
    }

    // Character Stream method to copy a text file
    public static void copyTextFile(String source, String destination) {
        try (FileReader fr = new FileReader(source);
             FileWriter fw = new FileWriter(destination)) {

            int data;
            // Reading and writing one character at a time
            while ((data = fr.read()) != -1) {
//                System.out.print(data +" ");
                fw.write(data);
            }

        } catch (IOException e) {
            System.out.println("Error during character stream operation: " + e.getMessage());
        }
    }
}

