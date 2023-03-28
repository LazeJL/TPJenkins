import org.testng.annotations.Test;
import org.tpJenkins.exercice2.Account;

import static org.testng.AssertJUnit.assertEquals;

public class BankAccountTest {

    @Test
    void testDeposit(Account account, double amount, double expectedBalance) {
        account.deposit(amount);
        assertEquals(expectedBalance, account.getBalance());
    }

    @Test
    void testWithdraw(Account account, double amount, double expectedBalance) {
        account.withdraw(amount);
        assertEquals(expectedBalance, account.getBalance());
    }

    @Test
    void testTransfer(Account fromAccount, Account toAccount, double amount, double expectedFromBalance, double expectedToBalance) {
        fromAccount.transfer(toAccount, amount);
        assertEquals(expectedFromBalance, fromAccount.getBalance());
        assertEquals(expectedToBalance, toAccount.getBalance());
    }

    @Test
    void testCalculateInterest(Account account, double expectedInterest) {
        assertEquals(expectedInterest, account.calculateInterest());
    }

    @Test
    void testAddAccount(B
