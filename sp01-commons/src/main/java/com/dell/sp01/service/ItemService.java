package com.dell.sp01.service;

import java.util.List;

import com.dell.sp01.pojo.Item;
import com.dell.sp01.pojo.User;

public interface ItemService {
	 List<Item> getItems(String orderId);
	 void decreaseNumbers(List<Item> list);
}
