package com.shivapreals;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shivapreals.config.AppConfig;
import com.shivapreals.dao.ItemDaoImpl;
import com.shivapreals.entity.Item;


/**
 * @author shivapreals
 *
 */
public class MainApp {
	public static void main(String[] args) throws SQLException {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);

		ItemDaoImpl item=context.getBean(ItemDaoImpl.class);
		Item item1=new Item();
		item1.setItemId((long) 1);
		item1.setItemName("itemName");
		item.save(item1);

		System.out.println(item.getItemList().get(0).getItemName());


		context.close();
	}
}
