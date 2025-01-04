package com.jp.programming.backoffice.tables;

import com.jp.programming.backoffice.CrudService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class TableService extends CrudService<Table> {

    @Inject
    public TableService(EntityManager entityManager) {
        super(entityManager);
    }

    public Table get() {
        return new Table().name("Table 1");
    }
}
