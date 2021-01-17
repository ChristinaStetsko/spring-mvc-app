package com.stetsko.dao;

import com.stetsko.entity.IEntity;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDAO<E extends IEntity> implements IDao<E> {

    protected Logger logger;

    @Autowired
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}