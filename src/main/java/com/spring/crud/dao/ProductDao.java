package com.spring.crud.dao;

import com.spring.crud.entity.Product;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ProductDao {

    // insert product
    @Transactional
    void insertProduct(Product product);

    // get all product
    List<Product> getAllProduct();

    // delete the single product
    @Transactional
    void deleteSingleProduct(int pid);

    // delete the single product
    Product getSingleProduct(int pid);

}
