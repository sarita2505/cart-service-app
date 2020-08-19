package com.java.model;

public class UserContext {
    private Integer accountId;

    public UserContext() {
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "UserContext{" +
                "accountId=" + accountId +
                '}';
    }
}
