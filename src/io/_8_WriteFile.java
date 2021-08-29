package io;

import java.io.*;

/*
8) Writing files
อธิบายการเขียนไฟล์

*/

public class _8_WriteFile {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        String filename = "files/io/from-user.txt";
        try {
            InputStreamReader inReader = new InputStreamReader(System.in);
            BufferedReader buffer = new BufferedReader(inReader);

            // เวลาเขียนไฟล์ default จะเขียนทับของเก่า แต่ถ้าไม่มีไฟล์จะสร้างไฟล์ขึ้นมาให้
            fileWriter = new FileWriter(filename);

            // ถ้าใส่ append = true เข้าไป จะเขียนต่อจากของเก่า
            // fileWriter = new FileWriter(filename, true);

            // ใช้ PrintWriter เพราะสามารถใช้ println() เขียนลงไฟล์ได้เลย (เหมือน System.out)
            PrintWriter file = new PrintWriter(fileWriter);

            // ใช้ BufferedWriter เพราะทำงานเร็ว แต่ควรใช้ newLine() ขึ้นบรรทัดใหม่และใช้ write() เขียนลงไฟล์
            // BufferedWriter out = new BufferedWriter(fileWriter);
            // out.write(">> " + line); // ใช้ write() แทนเพราะ BufferedWriter ไม่มี println()

            // ใช้ PrintWriter และ BufferedWriter เพราะทำงานเร็วและสะดวก
            // สร้าง BufferedWriter เก็บข้อมูลที่เขียน แล้วเอา PrintWriter ครอบเพื่อสั่ง println ง่ายๆ
            //  PrintWriter out = new PrintWriter(new BufferedWriter(fileWriter));

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
