package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 5) Reading files
 * <p>
 * ประยุกต์ readLine() method ไปใช้กับการวนลูปเพื่อรับค่าจากไฟล์
 * <p>
 * FileReader ต้องใช้ไฟล์ในการอ่าน จึงต้องใส่ที่อยู่ไฟล์ลงไป
 * <p>
 * ไฟล์ที่ใช้:
 * _5_ReadFile.csv
 * <p>
 * สิ่งที่เกี่ยวข้อง:
 * {@link _3_ReadLineMethod _3_ReadLineMethod},
 * {@link _4_ReadLineMethodLoop _4_ReadLineMethodLoop}
 *
 * @see java.io.FileReader
 * @see java.io.FileNotFoundException
 * @author Namkhing
 * @since 24/08/2021
 */

public class _5_ReadFile {
    public static void main(String[] args) {
        String filename = "files/io/_5_ReadFile.txt";
        try {
            FileReader fileReader = new FileReader(filename); // ใส่ที่อยู่ให้ถูก ไม่งั้นหาไฟล์ไม่เจอ
            // "files/io/_5_ReadFile.txt" คือ relative path (path ที่อ้างอิงต่อจากในโปรแกรม)


            BufferedReader buffer = new BufferedReader(fileReader);

            System.out.println("Open file:");
            String line = buffer.readLine();

            while (line != null) {
                System.out.println(">> " + line);
                line = buffer.readLine();
            }
        } catch (FileNotFoundException e) { // เกิดจากการหาไฟล์ไม่เจอ
            System.err.println("Cannot read file " + filename);
        } catch (IOException e) {
            System.err.println("Error reading from file");
        }
    }
}
