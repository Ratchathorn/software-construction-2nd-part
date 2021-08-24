package io;

import java.io.*;

/**
 * 10) Writing files
 * <p>
 * อธิบายการเขียนไฟล์
 * <p>
 * เวลาเขียนไฟล์ default จะเขียนทับของเก่า แต่ถ้าไม่มีไฟล์จะสร้างไฟล์ขึ้นมาให้
 * ถ้าใส่ append = true เข้าไป จะเขียนต่อจากของเก่า
 * <p>
 * ไฟล์ที่ใช้:
 * _10_WriteFile.txt
 * <p>
 * สิ่งที่เกี่ยวข้อง:
 * {@link _9_WriteFile _9_WriteFile}
 *
 * @see java.io.FileWriter
 * @see java.io.PrintWriter
 * @author Namkhing
 * @since 24/08/2021
 */

public class _10_WriteFile {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        String filename = "files/io/_10_WriteFile.txt";
        try {
            InputStreamReader inReader = new InputStreamReader(System.in);
            BufferedReader buffer = new BufferedReader(inReader);

            fileWriter = new FileWriter(filename, true);
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
