package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Producct;

public interface ProductRepo extends JpaRepository<Producct, Integer> {

}
