package com.xworkz.shoppingg.app.repository;

import com.xworkz.shoppingg.app.dto.ShoppinggDTO;

public interface ShoppinggRepository {

	abstract boolean onSave(ShoppinggDTO dto);
	
abstract boolean onUpdate(int emailId);

abstract boolean onUpdate1(int id);
abstract boolean onUpdate2(String name);

abstract boolean onDelete(int emailId);
abstract boolean onDelete1(int id);


abstract boolean onRead();
abstract boolean onRead1();

//boolean onRead1(int emailId);



}
