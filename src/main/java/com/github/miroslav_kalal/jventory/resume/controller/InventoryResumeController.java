package com.github.miroslav_kalal.jventory.resume.controller;

import com.github.miroslav_kalal.jventory.common.Constants;
import com.github.miroslav_kalal.jventory.model.Category;
import com.github.miroslav_kalal.jventory.model.Product;
import com.github.miroslav_kalal.jventory.resume.repository.CategoryRepository;
import com.github.miroslav_kalal.jventory.resume.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(Constants.API_ROOT + "/resume")
@RequiredArgsConstructor
public class InventoryResumeController {

    private final ItemService itemService;

    private final CategoryRepository categoryRepository;

    @GetMapping
    public ResponseEntity<List<Product>> getAll() {
        return new ResponseEntity<>(itemService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/categories")
    public ResponseEntity<List<Category>> getAllCategories() {
        return new ResponseEntity<>((List<Category>)categoryRepository.findAll(), HttpStatus.OK);
    }

}
