package com.github.miroslav_kalal.jventory.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;

@Getter
@Setter
@ToString
@Entity
public class Category extends AbstractEntity {

    private String name;

    private String type;

}
