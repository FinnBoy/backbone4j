package com.awaken.common;

import java.math.BigDecimal;

public class TransferTest {

    public void transaction() {
        Account srcAccount = this.getAccount(1);
        Account destAccount = this.getAccount(2);

        srcAccount.transferTo(destAccount, srcAccount.getBalance());
    }

    public Account getAccount(int number) {
        return new Account();
    }

    public static class Account {

        private BigDecimal balance;

        public BigDecimal getBalance() {
            return balance;
        }

        public void setBalance(BigDecimal balance) {
            this.balance = balance;
        }

        public void transferTo(Account destAccount, BigDecimal amount) {

        }
    }
}
