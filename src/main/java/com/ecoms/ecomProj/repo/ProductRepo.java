package com.ecoms.ecomProj.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecoms.ecomProj.model.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
