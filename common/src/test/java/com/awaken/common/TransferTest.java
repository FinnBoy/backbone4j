package com.awaken.common;

import net.sf.cglib.beans.BeanCopier;

import java.math.BigDecimal;

public class TransferTest {

    public void transaction() {

        Account srcAccount = this.getAccount(1);
        Account destAccount = this.getAccount(2);

        BeanCopier copier = BeanCopier.create(Account.class, Account.class, false);
        copier.copy(srcAccount, destAccount, null);

        srcAccount.transferTo(destAccount, srcAccount.getBalance());
    }

    public Account getAccount(int number) {
        Account account = new Account();
        account.setBalance(new BigDecimal(number));
        return account;
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
