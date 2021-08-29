package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
6) Reading files 2
ประยุกต์ readLine() method ไปใช้กับการวนลูปเพื่อรับค่าจากไฟล์
*/

public class _6_ReadFile {
    public static void main(String[] args) {
        String filename = "files/io/numbers.txt";
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader buffer = new BufferedReader(fileReader);

            int total = 0;
            String line = null;

            while ((line = buffer.readLine()) != null) { // อ่านไฟล์แล้วกำหนดค่าให้กับตัวแปร พร้อมทั้งกำหนดเงื่อนไข
                // แปลงจาก String เป็น int
                // ใช้เมื่อข้อมูลอาจมี String โผล่มา
                // แต่ถ้ารู้ว่าข้อมูลทุกตัวเป็น int สามารถใช้ readInt() จาก DataInputStream ได้เลย
                int num = Integer.parseInt(line);
                total += num;
            }
            System.out.println("Total: " + total);
        } catch (FileNotFoundException e) {
            System.err.println("Cannot read file " + filename);
        } catch (IOException e) {
            System.err.println("Error reading from file");
        }
    }
}
