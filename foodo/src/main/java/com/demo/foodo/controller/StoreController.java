package com.demo.foodo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.foodo.exception.ResourceNotFoundException;
import com.demo.foodo.model.Store;
import com.demo.foodo.repository.StoreRepository;

@RestController
@RequestMapping("/foodo/v1/")
public class StoreController {
	
	@Autowired
	private StoreRepository storeRepository;
	
//	get mapping to get list of all stores 
	@GetMapping("/StoreList")
	public List<Store> getAllStoreList (){
		return storeRepository.findAll();
	}
	
//	post mapping to add new store
	@PostMapping("/AddStore")
	public Store createStore(@RequestBody Store store) {
		return storeRepository.save(store);
	}
	
//	get mapping to get store by id
	@GetMapping("/Store/{id}")
	public ResponseEntity<Store> getAllStoreList (@PathVariable Integer id){
		Store store = storeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Store not found with id : "+ id));
		return ResponseEntity.ok(store);
	}
}
