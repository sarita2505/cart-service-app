package com.spring.dao.impl;

import com.spring.dao.ICartDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public abstract class AbstractCartDao<T,I> implements ICartDao<T,I> {
    @Autowired
    JdbcTemplate template;

    public AbstractCartDao() {
    }

    public AbstractCartDao(JdbcTemplate template) {
        this.template = template;
    }

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
}
