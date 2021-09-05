package exception;

import exception.classes.RestaurantFormatException;
import io.classes.Restaurant;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
16) Try-catch ordering
อธิบายการเรียง try-catch เมื่อใช้ catch หลายตัว

อ่านจากบนลงล่าง
ต้องเรียงเอา subclass ขึ้นก่อน ไม่งั้น Exception จะเข้าของ superclass
แต่ถ้าไม่มีความสัมพันธ์ subclass/superclass จะเรียงแบบไหนก็ได้
*/

public class _16_CatchOrdering {
    public static void main(String[] args) throws IOException {
        String filename = "files/io/rest.obj";
        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            ObjectInputStream os = new ObjectInputStream(fileInputStream);

            Restaurant restaurant = (Restaurant) os.readObject();

            System.out.println("Name: " + restaurant.getName());
            System.out.println("Address: " + restaurant.getAddress());
            System.out.println("Num seats = " + restaurant.getNumSeats());
        } catch (FileNotFoundException e) { // subclass of IOException ต้องอยู่ก่อน ไม่งั้นเข้าถึงไม่ได้ (compile error)
            e.printStackTrace();
        } catch (IOException e) { // มี catch ได้หลายตัว
            e.printStackTrace(); // ไว้ debug (คือไม่รู้ว่าผิดตรงไหน)
            // โยนที่ method (throws IOException) ได้เพราะไม่รู้ว่าจะทำยังไง ส่งต่อให้คนอื่นทำ
            throw e; // ได้รับมา โยนต่อไป
        } catch (ClassNotFoundException e) { // ไม่มีความสัมพันธ์ subclass/superclass ไว้ไหนก็ได้
            e.printStackTrace();
        }

    }
}
