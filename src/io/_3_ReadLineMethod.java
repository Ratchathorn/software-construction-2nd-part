package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 3) System.in.readLine() Method
 * <p>
 * อธิบาย readLine() method
 * <p>
 * readLine() อยู่ใน {@link java.io.BufferedReader BufferedReader} ซึ่งจะรับค่า {@link java.io.Reader Reader} เข้าไป
 * การที่ System.in เป็น {@link java.io.InputStream InputStream}
 * หมายความว่าต้องแปลง {@link java.io.InputStream InputStream} เป็น {@link java.io.Reader Reader}
 * ก่อนไปใช้ใน {@link java.io.BufferedReader BufferedReader}
 * โดยใช้ {@link java.io.InputStreamReader InputStreamReader} แปลง
 *
 * @see java.io.InputStreamReader
 * @see java.io.BufferedReader
 * @see java.io.IOException
 * @author Namkhing
 * @since 24/08/2021
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
