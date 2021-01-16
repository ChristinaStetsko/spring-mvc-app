package com.stetsko.dao;

import com.stetsko.dao.exception.DAOException;
import com.stetsko.entity.IEntity;

import java.util.List;
import java.util.Optional;

public interface IDao<E extends IEntity> {

    E create(E entity) throws DAOException;

    Optional<E> getEntity(Long id) throws DAOException;

    List<E> getAll() throws DAOException;

    E updateEntity(E entity) throws DAOException;

    void deleteEntity(Long id) throws DAOException;
}