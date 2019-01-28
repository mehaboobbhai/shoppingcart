package com.teamsankya.shoppingcart.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.teamsankya.shoppingcart.dao.ShoppingCartDao;
import com.teamsankya.shoppingcart.dao.ShoppingCartDaoHiberImpl;
import com.teamsankya.shoppingcart.dto.Product;

@Service
public class ShoppingCartService {
	final static Logger LOGGER = Logger.getLogger(ShoppingCartDaoHiberImpl.class);
	@Autowired
	@Qualifier("dao")
	private ShoppingCartDao shopcartdao;
	public List<Product> getDataFromServiceLayer(String name)
	{
		LOGGER.info("inside"+this.getClass().getSimpleName());
		LOGGER.info("calling getDataFromDaoLayer()");
		List<Product> res=shopcartdao.getDataFromDaoLayerr(name);
		return res;
	}
	

}
