package com.example.Products;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Author,String> {

}