package com.example.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.model.Product;
@Repository
@Component
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
