package io;

import io.classes.Restaurant;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
11) Writing objects (Text)
อธิบายการเขียน object ลงไฟล์ในรูปแบบ text

เหมาะสำหรับคนอ่าน
*/

public class _11_WriteObjectText {

    public static void main(String[] args) {
        String filename = "files/io/from-user.txt";
        Restaurant restaurant = new Restaurant("Bellini's","Cafe","KU",4.1);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filename);

            // เขียนแบบ BufferedWriter
//            BufferedWriter file = new BufferedWriter(fileWriter);
//            file.write(restaurant.getName() + ",");
//            file.write(restaurant.getType() + ",");
//            file.write(restaurant.getAddress() + ",");
//            file.write(restaurant.getRating() + "");
//            file.newLine();

            // เขียนแบบ PrintWriter
            PrintWriter file = new PrintWriter(fileWriter);
            file.println(restaurant);

            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
