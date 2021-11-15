package com.github.miroslav_kalal.jventory.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Getter
@Setter
@ToString
@Entity
public class ProductCategory extends AbstractEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    private Category category;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProductCategory that = (ProductCategory) o;
        return id != null && Objects.equals(id, that.id);
    }

}
