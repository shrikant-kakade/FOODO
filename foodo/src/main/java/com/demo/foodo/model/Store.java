package com.demo.foodo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "stores")
public class Store {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "store_id")
	private Integer storeId;
	
	@Column(name = "store_name")
	private String  storeName;
	
	@Column(name = "store_contact_no")
	private Integer StoreContactNo;
	
	@Column(name = "store_enail_id")
	private String  StoreEmailId;

	@Column(name = "store_rating")
	private Integer StoreRating;
	
	@Column(name = "store_address")
	private String  StoreAddress;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "store", cascade = CascadeType.ALL)
    private List<FoodItems> foodList;
	
	public Store(){
		
	}

	
	public Store(Integer storeId, String storeName, Integer storeContactNo, String storeEmailId, Integer storeRating,
			String storeAddress) {
		super();
		this.storeId = storeId;
		this.storeName = storeName;
		StoreContactNo = storeContactNo;
		StoreEmailId = storeEmailId;
		StoreRating = storeRating;
		StoreAddress = storeAddress;
	}
	
	public Integer getStoreId() {
		return storeId;
	}


	public String getStoreName() {
		return storeName;
	}


	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}


	public Integer getStoreContactNo() {
		return StoreContactNo;
	}


	public void setStoreContactNo(Integer storeContactNo) {
		StoreContactNo = storeContactNo;
	}


	public String getStoreEmailId() {
		return StoreEmailId;
	}


	public void setStoreEmailId(String storeEmailId) {
		StoreEmailId = storeEmailId;
	}


	public Integer getStoreRating() {
		return StoreRating;
	}


	public void setStoreRating(Integer storeRating) {
		StoreRating = storeRating;
	}


	public String getStoreAddress() {
		return StoreAddress;
	}


	public void setStoreAddress(String storeAddress) {
		StoreAddress = storeAddress;
	}
		
	
}
