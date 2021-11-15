package com.github.miroslav_kalal.jventory.resume.service;

import com.github.miroslav_kalal.jventory.model.Product;
import org.springframework.lang.NonNull;

import java.util.List;

public interface ItemService {

    @NonNull
    List<Product> getAll();

}
