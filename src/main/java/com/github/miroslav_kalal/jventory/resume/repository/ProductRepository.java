package com.github.miroslav_kalal.jventory.resume.repository;

import com.github.miroslav_kalal.jventory.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
