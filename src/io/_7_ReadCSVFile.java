package io;

import io.classes.Restaurant;
import io.classes.RestaurantDataSource;

import java.util.List;

/**
 * 7) Reading .csv files
 * <p>
 * ประยุกต์การอ่านค่าจากไฟล์ไปใช้กับ .csv
 * <p>
 * .csv (Comma-Separated Values) คือรูปแบบไฟล์ที่เก็บข้อมูลหลายตัวในบรรทัดเดียวโดยใช้สัญลักษณ์ขั้น
 * <p>
 * คลาสที่ใช้:
 * {@link io.classes.Restaurant Restaurant},
 * {@link io.classes.RestaurantDataSource RestaurantDataSource}
 * <p>
 * ไฟล์ที่ใช้:
 * _7_ReadCSVFile.csv
 * <p>
 * สิ่งที่เกี่ยวข้อง:
 * {@link _3_ReadLineMethod _3_ReadLineMethod},
 * {@link _5_ReadFile _5_ReadFile}
 *
 * @author Namkhing
 * @since 24/08/2021
 */

public class _7_ReadCSVFile {
    public static void main(String[] args) {
        String filename = "files/io/_7_ReadCSVFile.csv";

        // สร้าง RestaurantDataSource ใหม่ โดยที่ข้อมูลใช้ "," ขั้น
        RestaurantDataSource dataSource = new RestaurantDataSource(filename, ",");

        List<Restaurant> restaurantList = dataSource.readData();

        for (Restaurant restaurant : restaurantList) { // ไล่ทุกอย่างที่มีใน ArrayList
            System.out.println(restaurant); // ปริ้นข้อมูลในแต่ละ restaurant ออกมา
        }
    }
}
