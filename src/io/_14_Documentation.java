package io;

// Inline comment

/*
Block comment
*/

// Documentation comment (javadoc)
// ใช้บน class, method, variable
// สร้าง javadoc กด tools -> generate javadoc
// เขียนภาษาไทยไม่ได้

/**
 * Class documentation
 * เขียนไว้บนคลาส
 */
public class _14_Documentation {

    private String name;
    private int x;
    private double y;

    /**
     * Variable documentation
     * เขียนไว้บนตัวแปร
     */
    public static int MAX_NUM = 69;

    /**
     * Constructor documentation
     * เขียนไว้บน constructor
     * @param name String; name
     * @param x int; a number
     * @param y double; another number
     */
    public _14_Documentation(String name, int x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    /**
     * Method documentation
     * เขียนไว้บน method
     * @return int; a number
     */
    public int getX() {
        return x;
    }
}
