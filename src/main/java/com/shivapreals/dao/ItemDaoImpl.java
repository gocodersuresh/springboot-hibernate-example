package com.shivapreals.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shivapreals.entity.Item;

@Repository
public class ItemDaoImpl {
@Autowired
public SessionFactory sessionFactory;
@Transactional
	public void save(Item itemObj)
	{
		sessionFactory.getCurrentSession().save(itemObj);
	}
@Transactional
	public List<Item> getItemList()
	{
		return (List<Item>)sessionFactory.getCurrentSession().createQuery("from Item").list();
		
	}
}
