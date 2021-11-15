package com.github.miroslav_kalal.jventory.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public abstract class AbstractEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    protected Long id;

}
