package io;

import java.io.*;

public class BufferedAndDataStreamsDemo {
    public static void main(String[] args) {
        String textFile = "textFile.txt";
        String binaryFile = "binaryFile.bin";

        // Step 1: Write and read text using Buffered Streams
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(textFile))) {
            writer.write("This is a sample text file.");
            writer.newLine();
            writer.write("Buffered Streams are efficient!");
            System.out.println("Text written to " + textFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(textFile))) {
            System.out.println("\nReading from " + textFile + ":");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Step 2: Write and read binary data using Data Streams
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(binaryFile))) {
            dos.writeInt(42);
            dos.writeDouble(123.456);
            dos.writeUTF("Data Streams preserve data types!");
            System.out.println("\nBinary data written to " + binaryFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(binaryFile))) {
            int intValue = dis.readInt();
            double doubleValue = dis.readDouble();
            String utfString = dis.readUTF();

            System.out.println("\nReading from " + binaryFile + ":");
            System.out.println("Int: " + intValue);
            System.out.println("Double: " + doubleValue);
            System.out.println("String: " + utfString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

