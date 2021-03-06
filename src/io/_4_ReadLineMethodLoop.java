package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
4) System.in.readLine() Method with loop
ประยุกต์ readLine() method ไปใช้กับการวนลูปเพื่อรับค่าจาก input
*/

public class _4_ReadLineMethodLoop {
    public static void main(String[] args) {
        try {
            InputStreamReader inReader = new InputStreamReader(System.in);
            BufferedReader buffer = new BufferedReader(inReader);

            System.out.println("Enter lines:");
            String line = buffer.readLine();

            // วนลูปรับและพิมพ์ข้อมูลจนกว่าจะใส่ "bye"
            // เวลาเทียบสตริงใช้ .equals() เสมอ
            while (!line.equals("bye")) {
                System.out.println(">> " + line);
                line = buffer.readLine();
            }
        } catch (IOException e) {
            System.err.println("Error reading from user");
        }
    }
}