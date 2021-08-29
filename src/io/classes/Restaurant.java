package io.classes;

import java.io.Serializable;

/*
 * Restaurant Class
 * คลาสของ Restaurant
 */

/**
 * Restaurant class stores information about restaurant.
 *
 * @author Namkhing
 * @since 1.0
 */
public class Restaurant implements Serializable {

    static final long serialVersionUID = -2082421832283145772L; // ของทุกคนไม่เหมือนกัน

    private String name;
    private String type;
    private String address;
    private double rating;
    private int numSeats;

    /**
     * a maximum of seats is 100
     */
    public static int MAX_SEATS = 100;

    /**
     * Restaurant Constructor that takes all information about restaurant.
     *
     * @param name restaurant name
     * @param type  restaurant type
     * @param address restaurant address
     * @param rating restaurant rating, is a double between 0.0-5.0
     */
    public Restaurant(String name, String type, String address, double rating) {
        this.name = name;
        this.type = type;
        this.address = address;
        this.rating = rating;
    }

    public Restaurant(String name, String type, String address) {
        this(name,type,address,0);
    }

    /**
     * Return the number of seats in restaurant
     * @return number of seats in restaurant
     */
    public int getNumSeats() {
        return numSeats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + ',' +
                type + ',' +
                address + ',' +
                rating;
    }
}
