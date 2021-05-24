package bankAccount;

import java.util.HashMap;
import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, CorporateCustomerAccount> corporateCustomerAccountHashMap = new HashMap<>();
        HashMap<Integer, RetailCustomerAccount> retailCustomerAccountHashMap = new HashMap<>();

        CorporateCustomerAccount feyza = new CorporateCustomerAccount("1", "feyza", "aktaş", "feyza", 2500);
        CorporateCustomerAccount sedef = new CorporateCustomerAccount("2", "sedef", "yener", "sedef", 1000);
        RetailCustomerAccount ayse = new RetailCustomerAccount("3", "ayse", "karaman", "kocaeli", 2000);
        RetailCustomerAccount ahmet = new RetailCustomerAccount("4", "ahmet", "akar", "İstanbul", 2000);
        RetailCustomerAccount adem = new RetailCustomerAccount("5", "adem", "yıldız", "adem", 5000);

        corporateCustomerAccountHashMap.put(1, feyza);
        corporateCustomerAccountHashMap.put(2, sedef);
        retailCustomerAccountHashMap.put(3, ayse);
        retailCustomerAccountHashMap.put(4, ahmet);
        retailCustomerAccountHashMap.put(5, adem);

        for (Integer i : corporateCustomerAccountHashMap.keySet()) {
            System.out.println("id: " + i + " " + corporateCustomerAccountHashMap.get(i).getName() + " " + corporateCustomerAccountHashMap.get(i).getSurname() + " " + corporateCustomerAccountHashMap.get(i).getBalance() + " " + corporateCustomerAccountHashMap.get(i).getCompanyName());

        }
        for (Integer i : retailCustomerAccountHashMap.keySet()) {
            System.out.println("id: " + i + " " + retailCustomerAccountHashMap.get(i).getName() + " " + retailCustomerAccountHashMap.get(i).getSurname() + " " + retailCustomerAccountHashMap.get(i).getBalance() + " " + retailCustomerAccountHashMap.get(i).getAddress());

        }




    }
}

