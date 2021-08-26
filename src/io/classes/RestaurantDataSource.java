package io.classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * RestaurantDataSource Class
 * สร้างมาเพื่ออ่านข้อมูลจากไฟล์ โดยนำมาเก็บเป็น List ของ Restaurant
 * แล้วจึงเรียกไปใช้ในภายหลัง โดยไม่ต้องเขียนใหม่ในโปรแกรมให้ยุ่งยาก
 */

public class RestaurantDataSource {

    private String filename;
    private String c;

    public RestaurantDataSource(String filename, String chr) {
        this.filename = filename;
        this.c = chr;
    }

    public List<Restaurant> readData() {
        List<Restaurant> restaurants = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader buffer = new BufferedReader(fileReader);

            String line = null;

            while ((line = buffer.readLine()) != null) {
                String[] data = line.split(c); // ใช้ split() แยกค่าออกจากกัน
                String name = data[0].trim(); // ใช้ trim() เพื่อตัด space ออก (ถ้ามี)
                String type = data[1].trim();
                String area = data[2].trim();
                double rating = Double.parseDouble(data[3].trim());

                Restaurant restaurant = new Restaurant(name,type,area);
                restaurant.setRating(rating);
                restaurants.add(restaurant); // เพิ่ม restaurant เข้าไปใน list ที่ชื่อว่า restaurants
            }
        } catch (FileNotFoundException e) {
            System.err.println("Cannot read file " + filename);
        } catch (IOException e) {
            System.err.println("Error reading from file");
        }
        return restaurants;
    }
}
