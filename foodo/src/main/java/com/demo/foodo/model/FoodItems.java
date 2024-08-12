package com.demo.foodo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Food_Items")
public class FoodItems {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "food_Id")
	private Integer foodId;
	
	@Column(name = "food_Name")
	private String  foodName;
	
	@Column(name = "food_Description")
	private String  foodDescription;
	
	@Column(name = "food_Rating")
	private Integer foodRating;
	
	@Column(name = "food_Price")
	private Integer foodPrice;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "store_id")
	private Store store;
	
	public FoodItems() {
		
	}
	
	
	public FoodItems(Integer foodId, String foodName, String foodDescription, Integer foodRating, Integer foodPrice,
			Store store) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.foodDescription = foodDescription;
		this.foodRating = foodRating;
		this.foodPrice = foodPrice;
		this.store = store;
	}
	

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getFoodDescription() {
		return foodDescription;
	}

	public void setFoodDescription(String foodDescription) {
		this.foodDescription = foodDescription;
	}

	public Integer getFoodRating() {
		return foodRating;
	}

	public void setFoodRating(Integer foodRating) {
		this.foodRating = foodRating;
	}

	public Integer getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(Integer foodPrice) {
		this.foodPrice = foodPrice;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Integer getFoodId() {
		return foodId;
	}
	
}
