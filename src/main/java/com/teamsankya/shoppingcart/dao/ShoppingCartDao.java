package com.teamsankya.shoppingcart.dao;

import java.util.List;

import com.teamsankya.shoppingcart.dto.Product;

public interface ShoppingCartDao {
	
	public Product getDataFromDaoLayer(int id);
	public List<Product> getDataFromDaoLayerr(String name);

}
