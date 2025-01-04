package com.jp.programming.backoffice;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Transactional
public abstract class CrudService<E> {

    private final EntityManager entityManager;

    protected CrudService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public E persist(E entity) {
        entityManager.persist(entity);
        return entity;
    }
}
