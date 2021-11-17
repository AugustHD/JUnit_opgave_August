package demo;

public class Account {
    private String accountName;
    private String ownerName;
    private int saldo;

    public Account(String accountName, String ownerName, int saldo) {
        this.accountName = accountName;
        this.ownerName = ownerName;
        this.saldo = saldo;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getSaldo() {
        return saldo;
    }

    public int insert(int amount) {
        saldo = saldo + amount;
        return saldo;
    }

    public int withdraw(int amount) {
        saldo = saldo - amount;
        if (saldo < 0) {
            throw new IllegalArgumentException();
        }
        return saldo;
    }

    // Jeg er usikker på om denne toString metode er gjort rigtigt. Var aldrig særlig god til dem...
    @Override
    public String toString() {
        return this.accountName + " belongs to " + this.ownerName + ". Your current saldo is: " + getSaldo();
    }

}
