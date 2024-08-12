package com.demo.foodo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.foodo.model.FoodItems;
import com.demo.foodo.repository.FoodItemsRepository;

@RestController
@RequestMapping("/foodo/v1/")
public class FoodItemsController {
	
	@Autowired
	private FoodItemsRepository ffoodItemsRepo;
	
	@GetMapping("/FoodItemsList")
	private List<FoodItems> getAllFoodItems(){
		return ffoodItemsRepo.findAll();
	}
}
