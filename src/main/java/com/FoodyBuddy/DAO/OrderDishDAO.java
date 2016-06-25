package com.FoodyBuddy.DAO;
import java.util.List;

import com.FoodyBuddy.Model.OrderDish;

public interface OrderDishDAO {

	public void insert(OrderDish s);
	public void update(OrderDish s);
	public void delete(OrderDish s);
	public Integer sumDishPrice(Integer OrderId);
	public OrderDish getByOrderId(Integer OrderId);
	public OrderDish getByDishId(Integer DishId);
	public OrderDish getById(Integer Id);
	public List<OrderDish> list();
	
}