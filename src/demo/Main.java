package demo;

public class Main {

    public static void main(String[] args) {
        Account myAccount = new Account("Bolig-opsparing", "August Dedenroth", 5000);
        myAccount.insert(50);
        System.out.println(myAccount.getSaldo());
    }
}
