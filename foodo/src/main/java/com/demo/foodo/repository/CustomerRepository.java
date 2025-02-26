package com.demo.foodo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.foodo.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
