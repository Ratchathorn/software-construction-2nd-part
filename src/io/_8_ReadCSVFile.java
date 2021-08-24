package io;

import io.classes.Restaurant;
import io.classes.RestaurantDataSource;

import java.util.List;

/**
 * 8) Reading .csv files 2
 * <p>
 * ประยุกต์การอ่านค่าจากไฟล์ไปใช้กับ .csv
 * <p>
 * .csv (Comma-Separated Values) คือรูปแบบไฟล์ที่เก็บข้อมูลหลายตัวในบรรทัดเดียวโดยใช้สัญลักษณ์ขั้น
 * <p>
 * ไฟล์ที่ใช้:
 * _8_ReadCSVFile.csv
 * <p>
 * คลาสที่ใช้:
 * {@link io.classes.Restaurant Restaurant},
 * {@link io.classes.RestaurantDataSource RestaurantDataSource}
 * <p>
 * สิ่งที่เกี่ยวข้อง:
 * {@link _3_ReadLineMethod _3_ReadLineMethod},
 * {@link _5_ReadFile _5_ReadFile},
 * {@link _7_ReadCSVFile _7_ReadCSVFile}
 *
 * @author Namkhing
 * @since 24/08/2021
 */

public class _8_ReadCSVFile {
    public static void main(String[] args) {
        String filename = "files/io/_8_ReadCSVFile.csv";

        // สร้าง RestaurantDataSource ใหม่ โดยที่ข้อมูลใช้ "|" ขั้น
        RestaurantDataSource dataSource = new RestaurantDataSource(filename, "\\|");

        List<Restaurant> restaurantList = dataSource.readData();

        for (Restaurant restaurant : restaurantList) {
            System.out.println(restaurant);
        }
    }
}
