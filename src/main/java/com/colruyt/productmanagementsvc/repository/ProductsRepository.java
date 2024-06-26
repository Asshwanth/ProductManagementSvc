package com.colruyt.productmanagementsvc.repository;

import com.colruyt.productmanagementsvc.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Product,String>, JpaSpecificationExecutor<Product> {

}