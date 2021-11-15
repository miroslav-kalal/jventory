package com.github.miroslav_kalal.jventory.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import java.util.Objects;

import javax.persistence.Entity;

@Getter
@Setter
@ToString
@Entity
public class Currency extends AbstractEntity {

    private String CurrencyName;

    private String CurrencyAbbreviation;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Currency currency = (Currency) o;
        return id != null && Objects.equals(id, currency.id);
    }

}
