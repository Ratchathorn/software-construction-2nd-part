package io;

import java.util.Scanner;

/*
10) Scanner
อธิบายการใช้ Scanner

อ่านข้อมูลสะดวก แต่ช้า พร้อมทั้งต้องรู้ format ของข้อมูลด้วย
เว้นข้อมูลด้วย whitespace (newline/space bar) (คือไปหาตัวถัดไปที่เอามาใส่ตัวแปรได้)
*/

public class _10_Scanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data1 = scanner.next();
        int data2 = scanner.nextInt();
        double data3 = scanner.nextDouble();
        String data4 = scanner.nextLine(); // enter = อ่านจบ

        System.out.println("data1 = " + data1);
        System.out.println("data2 = " + data2);
        System.out.println("data3 = " + data3);
        System.out.println("data4 = " + data4);
    }
}
