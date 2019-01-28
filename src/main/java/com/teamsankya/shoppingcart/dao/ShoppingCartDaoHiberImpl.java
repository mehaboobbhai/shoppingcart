package com.teamsankya.shoppingcart.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.criteria.internal.compile.CriteriaQueryTypeQueryAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.teamsankya.shoppingcart.controller.MainController;
import com.teamsankya.shoppingcart.dto.Product;

@Repository
public class ShoppingCartDaoHiberImpl implements ShoppingCartDao {
	
	
	final static Logger LOGGER = Logger.getLogger(ShoppingCartDaoHiberImpl.class);
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public Product getDataFromDaoLayer(int id) {
		/*Product p=new Product();
		p.setPdisc("best look");
		p.setpId(25);
		p.setpName("softpen");
		p.setpPrice(25);
		Product p1=new Product();
		p1.setPdisc("nice grip");
		p1.setpId(30);
		p1.setpName("rockpen");
		p1.setpPrice(20);
		Product p2=new Product();
		p2.setPdisc("best look");
		p2.setpId(25);
		p2.setpName("softpen");
		p2.setpPrice(25);
		Product p3=new Product();
		p3.setPdisc("nice grip");
		p3.setpId(30);
		p3.setpName("rockpen");
		p3.setpPrice(20);
		List<Product> list=new ArrayList<Product>();
		list.add(p1);
		list.add(p);
		list.add(p2);
		list.add(p3);
		Product res;
		//LOGGER.info("inside"+this.getClass().getSimpleName());
		
		try {
			
			res = sessionFactory.getCurrentSession().get(Product.class, id);
		} catch (HibernateException e) {
			res = sessionFactory.openSession().get(Product.class, id);
		}*/
		return null;
	}
	
	
	
	@Override
	public List<Product> getDataFromDaoLayerr(String name) {
		String hql="from Product where pName='"+name+"'";
		Session sess=sessionFactory.openSession();
		org.hibernate.query.Query<Product>q=sess.createQuery(hql);
		//Product res=q.uniqueResult();
		List<Product> res=q.list();
	System.out.println(res);
		return res;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
