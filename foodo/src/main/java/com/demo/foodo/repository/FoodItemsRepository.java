package com.demo.foodo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.foodo.model.FoodItems;

@Repository
public interface FoodItemsRepository extends JpaRepository<FoodItems, Integer>{

}
