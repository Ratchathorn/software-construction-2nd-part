package exception.classes;

public class RestaurantFormatException extends RuntimeException{

    public RestaurantFormatException() {}

    public RestaurantFormatException(String message) {
        super(message);
    }
}
