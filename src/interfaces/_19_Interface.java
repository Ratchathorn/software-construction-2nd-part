package interfaces;

import interfaces.classes.BankAccount;
import interfaces.classes.Country;
import interfaces.classes.Data;

/*
19) Interfaces
อธิบายวิธีการใช้ interface
 */

public class _19_Interface {
    public static void main(String[] args) {
        BankAccount[] bankAccounts =
                { new BankAccount(100), new BankAccount(200), new BankAccount(300) };
        double balanceAvg = Data.average(bankAccounts);
        System.out.println("Average balance = " + balanceAvg);

        Country[] countries =
                { new Country("Thailand",50), new Country("UK",60), new Country("Mexico",80) };
        double areaAvg = Data.average(countries);
        System.out.println("Average area = " + areaAvg);
    }
}
