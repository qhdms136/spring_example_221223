package com.example.lesson02.model;

import java.util.Date;

public class UsedGoods {
	private int id;
	private int sellerId;
	private String title;
	private String descrption;
	private int price;
	private String picture;
	private Date createdAt;
	private Date nupdatedAt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescrption() {
		return descrption;
	}
	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getNupdatedAt() {
		return nupdatedAt;
	}
	public void setNupdatedAt(Date nupdatedAt) {
		this.nupdatedAt = nupdatedAt;
	}
}
