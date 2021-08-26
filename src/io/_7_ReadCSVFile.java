package io;

import io.classes.Restaurant;
import io.classes.RestaurantDataSource;

import java.util.List;

/*
 * 7) Reading .csv files
 * ประยุกต์การอ่านค่าจากไฟล์ไปใช้กับ .csv
 *
 * .csv (Comma-Separated Values) คือรูปแบบไฟล์ที่เก็บข้อมูลหลายตัวในบรรทัดเดียวโดยใช้สัญลักษณ์ขั้น
 */

public class _7_ReadCSVFile {
    public static void main(String[] args) {
        String filename = "files/io/restaurants.csv";

        // สร้าง RestaurantDataSource ใหม่ โดยที่ข้อมูลใช้ "," ขั้น (เปลี่ยนได้)
        RestaurantDataSource dataSource = new RestaurantDataSource(filename, ",");

        List<Restaurant> restaurantList = dataSource.readData();

        for (Restaurant restaurant : restaurantList) { // ไล่ทุกอย่างที่มีใน ArrayList
            System.out.println(restaurant); // ปริ้นข้อมูลในแต่ละ restaurant ออกมา
        }
    }
}
