package com.spring.dao.impl;

import com.spring.dao.IAddressDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public abstract class AbstractDao<T,I> implements IAddressDao<T,I> {
    @Autowired
    private JdbcTemplate template;

    public AbstractDao(JdbcTemplate template) {
        this.template = template;
    }

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
}
