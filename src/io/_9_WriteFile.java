package io;

import java.io.*;

/**
 * 9) Writing files
 * <p>
 * อธิบายการเขียนไฟล์
 * <p>
 * การอ่านลงไฟล์อ่านได้เร็วเพราะใช้ CPU แต่การเขียนลงไฟล์จะช้าเพราะใช้ Disk
 * ดังนั้น ถ้าโปรแกรมจบก่อนเขียนเสร็จ ข้อมูลจะผิดพลาด
 * ต้องปิดไฟล์ด้วย close() ก่อน (รอให้เขียนเสร็จแล้วค่อยปิด)
 * <p>
 * เวลาเขียนไฟล์ default จะเขียนทับของเก่า แต่ถ้าไม่มีไฟล์จะสร้างไฟล์ขึ้นมาให้
 * <p>
 * ไฟล์ที่ใช้:
 * _9_WriteFile.txt
 *
 * @see java.io.FileWriter
 * @see java.io.PrintWriter
 * @author Namkhing
 * @since 24/08/2021
 */

public class _9_WriteFile {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        String filename = "files/io/_9_WriteFile.txt";
        try {
            InputStreamReader inReader = new InputStreamReader(System.in);
            BufferedReader buffer = new BufferedReader(inReader);

            fileWriter = new FileWriter(filename);
            // ใช้ PrintWriter เพราะสามารถใช้ println() เขียนลงไฟล์ได้เลย (เหมือน System.out)
            PrintWriter file = new PrintWriter(fileWriter);

            System.out.println("Input text to file:");
            String line = buffer.readLine();

            while (!line.equals("bye")) {
                file.println(">> " + line);
                line = buffer.readLine();
            }

            file.flush(); // อาจมีค้างไว้ ดันให้เขียนลงไฟล์
        } catch (IOException e) {
            System.err.println("Error reading from user");
        } finally {
            // close file
        }
    }
}
