package com.java.model;

public class UserContext {
    private int accountId;

    public UserContext() {
    }

    public UserContext(int accountId) {
        this.accountId = accountId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "UserContext{" +
                "accountId=" + accountId +
                '}';
    }
}
