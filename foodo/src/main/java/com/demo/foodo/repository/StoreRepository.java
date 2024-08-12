package com.demo.foodo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.foodo.model.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Integer>{

}
