package com.spring.dao.impl;

import com.java.model.UserContext;
import com.spring.model.CartRequest;
import com.spring.util.CartRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CartDaoImpl extends AbstractCartDao<CartRequest, Integer> {
    public CartDaoImpl(JdbcTemplate template) {
        super(template);
    }

    private static final String save = "insert into cart(itemid,accountid) values (?,?)";
    private static final String update = "update cart set itemid=?,accountid=? where id=?";
    private static final String delete = "delete from cart where itemid=? and accountid = ?";
    private static final String select = "select itemid,accountid from cart where accountid=?";
//    @Autowired
//    private Item item;
    @Autowired
    private UserContext userContext;



    @Override
    public Integer save(CartRequest cartRequest) {
        return getTemplate().update(save, new java.lang.Object[]{cartRequest.getItemId(), userContext.getAccountId()});
    }

    @Override
    public Integer update(CartRequest cartRequest, Integer accountId) {
        return null;
    }

    @Override
    public Integer delete( Integer itemId) {
        return getTemplate().update(delete, new java.lang.Object[]{userContext.getAccountId(),itemId});
    }

    @Override
    public List<CartRequest> select() {
        return getTemplate().query(select,new CartRowMapper(),new Object[]{userContext.getAccountId()});
    }
    public List<CartRequest> select1(int accId) {
        return getTemplate().query(select,new CartRowMapper(),new Object[]{userContext.getAccountId()});
    }


}
