package com.github.miroslav_kalal.jventory.resume.service;

import com.github.miroslav_kalal.jventory.model.Product;
import com.github.miroslav_kalal.jventory.resume.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ItemService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> getAll() {
        return (List<Product>) productRepository.findAll();
    }

}
