package com.dell.sp01.service;

import com.dell.sp01.pojo.Order;

public interface OrderService {
	Order getOrder(String orderId);
	void addOrder(Order order);
}
