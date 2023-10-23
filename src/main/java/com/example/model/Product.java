package com.example.model;

import java.io.Serializable;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
@Component
public class Product implements Serializable {
	
	@Id
	@GenericGenerator(name="ref",strategy = "increment")
	@GeneratedValue(generator = "ref")
	private int pid;
	private String pname;
	private int quantity;
	private int price;
	public Product() {
		System.out.println("Product object creades...");
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
