package io;

import java.io.*;

/*
9) Closing files
อธิบายการปิดไฟล์

การอ่านลงไฟล์อ่านได้เร็วเพราะใช้ CPU แต่การเขียนลงไฟล์จะช้าเพราะใช้ Disk
ดังนั้น ถ้าโปรแกรมจบก่อนเขียนเสร็จ ข้อมูลจะผิดพลาด
ต้องปิดไฟล์ด้วย close() ก่อน (รอให้เขียนเสร็จแล้วค่อยปิด)
*/

public class _9_CloseFile {

    public static void main(String[] args) {
        String restaurantFilename = "files/io/restaurants.csv";
        String outputFilename = "files/io/from-user.txt";
        FileWriter fileWriter = null;
        try {
            FileReader inReader = new FileReader(restaurantFilename);
            BufferedReader buffer = new BufferedReader(inReader);

            fileWriter = new FileWriter(outputFilename);
            PrintWriter file = new PrintWriter(new BufferedWriter(fileWriter));

            String line = buffer.readLine();

            while (line != null) {
                String[] data = line.split(",");
                String name = data[0].trim();
                file.println("Name: " + name);
                line = buffer.readLine();
            }
            file.flush();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Error reading from user");
        } finally { // ทำก่อนจบโปรแกรม
            try {
                if (fileWriter != null) { // เชคก่อนว่ามีไฟล์ให้ปิดมั้ย
                    fileWriter.close(); // ปิดไฟล์
                }
            } catch (IOException e) {
                System.err.println("Error closing file");
            }
        }
    }
}
