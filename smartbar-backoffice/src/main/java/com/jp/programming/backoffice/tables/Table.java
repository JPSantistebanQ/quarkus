package com.jp.programming.backoffice.tables;

import com.jp.programming.backoffice.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@jakarta.persistence.Table(name = "Sbo_Tables",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"name"})
        })
public class Table extends BaseEntity {

    @NotNull
    private String name;

    @NotNull
    private Integer seatCount;

    @NotNull
    private Boolean active;

    public Table name(String name) {
        this.name = name;
        return this;
    }
}
