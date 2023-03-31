package com.xworkz.shoppingg.app.service;

import com.xworkz.shoppingg.app.dto.ShoppinggDTO;

public interface ShoppinggService {
	
 abstract boolean ValidateAndSave(ShoppinggDTO dto);
 
 
 abstract boolean UpdateDTO(int emailId);
 abstract boolean UpdateDTO1(int id);
 abstract boolean UpdateDTO2(String name);
 
 abstract boolean DeleteDTO(int emailId);
 abstract boolean DeleteDTO1(int id);

 abstract boolean ReadDTO();
 abstract boolean ReadDTO1();
 
}
