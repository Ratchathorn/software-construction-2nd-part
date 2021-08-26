package io;

import java.io.IOException;

/*
 * 2) System.in.read() Method
 * อธิบาย read() method
 */

public class _2_ReadMethod {
    public static void main(String[] args) {
        System.out.print("Enter characters: ");
        try {
            // read() อยู่ใน InputStream
            // read() ต้องมี try-catch ดัก
            int inChar = System.in.read(); // อ่านทีละ byte
            char a = (char) inChar;
            System.out.println("You entered: " + a);
            System.out.println("Input character: " + inChar);
        } catch (IOException e) { // เลือก exception ให้ถูก
            // IOException เกิดจากการที่รับ/พิมพ์ข้อมูลแล้วมีปัญหา
            System.err.println("Error reading from user");
        }
    }
}
