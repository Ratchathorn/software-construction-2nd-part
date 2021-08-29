package io;

import io.classes.Restaurant;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
12) Writing objects
อธิบายการเขียน object ลงไฟล์

- Connection -> เชื่อมต่อกับโลกภายนอก
- Chain -> เชื่อมต่อกับ Connection

ต้อง serialize ก่อนถึงจะเขียน object ได้
Object -> ObjectOutputStream -> FileOutputStream -> File
Object = object ที่สร้างในโปรแกรม เก็บค่าต่างๆ
ObjectOutputStream ทำให้แบนแล้วส่งต่อ (serialize) ทำให้เขียนใส่ไฟล์ได้
fileOutputStream ทำให้เป็น binary แล้วเอาไปเขียนลงไฟล์

ถ้าจะ serialize ต้อง implement Serializable (เป็น interface) ใบคลาส
*/

public class _12_WriteObject {

    public static void main(String[] args) {
        String filename = "files/io/rest.obj";
        Restaurant restaurant = new Restaurant("Bellini's","Cafe","KU",4.1);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            ObjectOutputStream os = new ObjectOutputStream(fileOutputStream);

            os.writeObject(restaurant);
            os.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
