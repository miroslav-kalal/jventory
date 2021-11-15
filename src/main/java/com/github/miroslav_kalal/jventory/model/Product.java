package com.github.miroslav_kalal.jventory.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Getter
@Setter
@ToString
@Entity
public class Product extends AbstractEntity {

    private String name;

    private int quantity;

    @OneToMany(mappedBy = "product")
    @ToString.Exclude
    private List<ProductCategory> categories;

    private String description;

    private int price;

    @ManyToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    private Currency currency;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Product product = (Product) o;
        return id != null && Objects.equals(id, product.id);
    }
}
