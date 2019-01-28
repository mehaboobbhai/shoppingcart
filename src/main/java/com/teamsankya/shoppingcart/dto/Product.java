package com.teamsankya.shoppingcart.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	@Id
	@Column(name="id_product")
	private int pId;
	@Column(name="name")
	private String pName;
	@Column(name="price")
	private double pPrice;
	@Column(name="description")
	private String pdisc;
	
	public String getPdisc() {
		return pdisc;
	}
	public void setPdisc(String pdisc) {
		this.pdisc = pdisc;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getpPrice() {
		return pPrice;
	}
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + ", pdisc=" + pdisc + "]";
	}
	

}
