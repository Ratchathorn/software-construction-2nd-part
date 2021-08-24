package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 4) System.in.readLine() Method with loop
 * <p>
 * ประยุกต์ readLine() method ไปใช้กับการวนลูปเพื่อรับค่าจาก input
 * <p>
 * สิ่งที่เกี่ยวข้อง:
 * {@link _3_ReadLineMethod _3_ReadLineMethod}
 * <p>
 * @author Namkhing
 * @since 24/08/2021
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