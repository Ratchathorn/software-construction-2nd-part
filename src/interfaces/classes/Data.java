package interfaces.classes;

public class Data {

//    public static double average(BankAccount[] objects) {
//        double sum = 0;
//        for (BankAccount obj : objects) {
//            sum += obj.getBalance();
//        }
//        if (objects.length > 0) {
//            return sum / objects.length;
//        }
//        return 0;
//    }

//    public static double average(Country[] objects) {
//        double sum = 0;
//        for (Country obj : objects) {
//            sum += obj.getArea();
//        }
//        if (objects.length > 0) {
//            return sum / objects.length;
//        }
//        return 0;
//    }

        public static double average(Measurable[] objects) {
        double sum = 0;
        for (Measurable obj : objects) {
            sum += obj.getMeasure();
        }
        if (objects.length > 0) {
            return sum / objects.length;
        }
        return 0;
    }
}
