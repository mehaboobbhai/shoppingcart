package com.teamsankya.shoppingcart.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.teamsankya.shoppingcart.dao.ShoppingCartDao;
import com.teamsankya.shoppingcart.dto.Product;
import com.teamsankya.shoppingcart.service.ShoppingCartService;

import javassist.tools.reflect.Sample;

@Controller
public class MainController {
	
	final static Logger LOGGER = Logger.getLogger(MainController.class);
	@Autowired
	@Qualifier("service")
	private ShoppingCartService cartservice;
	@RequestMapping(value="getdata",method =RequestMethod.GET)
	public ModelAndView productSearch(String name,ModelAndView map,@RequestParam(required = false)Integer page)
	{
		//ModelAndView map=new ModelAndView("searchbar.jsp");
		LOGGER.info("inside"+this.getClass().getSimpleName());
		LOGGER.info("calling getDataFromServiceLayer()");
		List<Product> res=cartservice.getDataFromServiceLayer(name);
		PagedListHolder<Product> pagedListHolder = new PagedListHolder<Product>(res);
		pagedListHolder.setPageSize(6);
		int pag=pagedListHolder.getPageCount();
		System.out.println("get pagescount"+pag);
		System.out.println("no of pages"+page);
		System.out.println("gagelist"+pagedListHolder.getPageList());
		String pname=null;
		for (Product product : res) {
			pname=product.getpName();
		}
		if(pname!=null && pname.equals(name))
		{	
			map.setViewName("response.jsp");
			map.addObject("maxPages", pagedListHolder.getPageCount());
			if(page==null || page < 1 || page > pagedListHolder.getPageCount())
				page=1;
			map.addObject("page", page);
			if(page == null || page < 1 || page > pagedListHolder.getPageCount())
			{
	            pagedListHolder.setPage(0);
	            map.addObject("users", pagedListHolder.getPageList());
	            }
	            else if(page <= pagedListHolder.getPageCount())
	            {
	                pagedListHolder.setPage(page-1);
	                map.addObject("users", pagedListHolder.getPageList());
	            }
	        map.addObject("page", page);
			map.addObject("response",res);
			map.addObject("pname", pname);
			return map;
		}
		
		else
		{
			map.setViewName("searchbar.jsp");
			map.addObject("value",true);
			map.addObject("msg","Search Item("+name+")Not Found..Please Try Another..");
			return map;
		}
		
		}
	}
