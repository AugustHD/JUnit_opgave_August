package demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void insert() {
        Account testAccount = new Account ("August's account", "August", 0);
        int expected = 50;
        testAccount.insert(50);
        int result = testAccount.getSaldo();
        assertEquals(expected, result);
    }

    @Test
    void withdraw() {
        Account testAccount = new Account ("August's account", "August", 100);
        int expected = 30;
        testAccount.withdraw(70);
        int result = testAccount.getSaldo();
        assertEquals(expected, result);
    }

    @Test
    void testingWithdraw_With_Negative_Balance() {
        Account testAccount = new Account ("August's account", "August", 100);
        assertThrows(IllegalArgumentException.class, () -> testAccount.withdraw(130));
    }

}