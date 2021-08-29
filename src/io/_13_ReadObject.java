package io;

import io.classes.Restaurant;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
13) Reading objects
อธิบายการอ่าน object จากไฟล์

ถ้าเปลี่ยนโค้ดใน class จะอ่านไม่ได้
ถ้าไม่ได้ลบโค้ดเก่า วิธีแก้ปัญหาคือระบุ SerialVersionID ลงในโค้ด
แต่ถ้าเซต SerialVersionID แล้วต้องห้ามเปลี่ยนของเก่า
*/

public class _13_ReadObject {
    public static void main(String[] args) {
        String filename = "files/io/rest.obj";
        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            ObjectInputStream os = new ObjectInputStream(fileInputStream);

            Restaurant restaurant = (Restaurant) os.readObject(); // readObject() ให้ค่า Object จึงต้อง cast เป็น Restaurant

            System.out.println("Name: " + restaurant.getName());
            System.out.println("Address: " + restaurant.getAddress());
            System.out.println("Num seats = " + restaurant.getNumSeats());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
