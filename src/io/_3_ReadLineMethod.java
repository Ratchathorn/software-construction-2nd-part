package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 3) System.in.readLine() Method
 * อธิบาย readLine() method
 *
 * readLine() อยู่ใน BufferedReader ซึ่งจะรับค่า Reader เข้าไป
 * การที่ System.in เป็น InputStream หมายความว่าต้องแปลง InputStream เป็น Reader ก่อนไปใช้ใน BufferedReader
 * โดยใช้ InputStreamReader แปลง
 */

public class _3_ReadLineMethod {
    public static void main(String[] args) {
        System.out.print("Enter characters: ");
        try {
            // InputStreamReader แปลง InputStream เป็น Reader
            InputStreamReader inReader = new InputStreamReader(System.in);

            // BufferedReader ช่วยให้อ่านทีละบรรทัด
            BufferedReader buffer = new BufferedReader(inReader);

            String line = buffer.readLine(); // อ่านทีละบรรทัด
            System.out.println("You entered: " + line);
        } catch (IOException e) {
            System.err.println("Error reading from user");
        }
    }
}
