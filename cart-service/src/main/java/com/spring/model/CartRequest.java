package com.spring.model;

public class CartRequest {
    private Integer id;
    private Integer itemId;
    private Integer accountId;

    public CartRequest() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "CartRequest{" +
                "id=" + id +
                ", itemId=" + itemId +
                ", accountId=" + accountId +
                '}';
    }
}
