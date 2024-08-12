package com.demo.foodo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Customer_id")
	private Integer customerId;
	
	@Column(name = "customer_name")
	private String customerName;
	
	@Column(name = "customer_address")
	private String customerAddress;
	
	@Column(name = "customer_contact_no")
	private Integer customerContactNo;
	
	@Column(name = "customer_email_id")
	private String customerEmailId;
	
	@Column(name = "customer_balance")
	private Integer customerBalance;
	
	
	public Customer() {
		
	}

	public Customer(Integer customerId, String customerName, String customerAddress, Integer customerContactNo,
			String customerEmailId, Integer customerBalance) {
		super();
		this.customerId    	   = customerId;
		this.customerName      = customerName;
		this.customerAddress   = customerAddress;
		this.customerContactNo = customerContactNo;
		this.customerEmailId   = customerEmailId;
		this.customerBalance   = customerBalance;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public Integer getCustomerContactNo() {
		return customerContactNo;
	}

	public void setCustomerContactNo(Integer customerContactNo) {
		this.customerContactNo = customerContactNo;
	}

	public String getCustomerEmailId() {
		return customerEmailId;
	}

	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

	public Integer getCustomerBalance() {
		return customerBalance;
	}

	public void setCustomerBalance(Integer customerBalance) {
		this.customerBalance = customerBalance;
	}

}
