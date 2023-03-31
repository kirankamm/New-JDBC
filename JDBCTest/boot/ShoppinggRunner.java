package com.xworkz.shoppingg.app.boot;

import com.xworkz.shoppingg.app.dto.ShoppinggDTO;
import com.xworkz.shoppingg.app.repository.ShoppinggRepository;
import com.xworkz.shoppingg.app.repository.ShoppinggRepositoryIMPL;
import com.xworkz.shoppingg.app.service.ShoppinggService;
import com.xworkz.shoppingg.app.service.ShoppinggServiceIMPL;

public class ShoppinggRunner {

	public static void main(String[] args) {

		ShoppinggDTO shoppinggDTO = new ShoppinggDTO(11, "danu", "dip", 7795, "belagavi", 11);
		ShoppinggDTO shoppinggDTO1 = new ShoppinggDTO(12, "monesh", "iti", 6564, "raybag", 22);
		ShoppinggDTO shoppinggDTO2 = new ShoppinggDTO(13, "barati", "tenth", 6899, "gulbuga", 33);
		ShoppinggDTO shoppinggDTO3 = new ShoppinggDTO(14, "shankar", "sslc", 0257, "mahalingpura", 44);
		ShoppinggDTO shoppinggDTO4 = new ShoppinggDTO(15, "ramchandra", "be", 2381, "kudachi", 55);

		ShoppinggRepository shoppinggRepository = new ShoppinggRepositoryIMPL();

		ShoppinggService shoppinggService = new ShoppinggServiceIMPL(shoppinggRepository);

		shoppinggService.ValidateAndSave(shoppinggDTO);

		shoppinggService.ValidateAndSave(shoppinggDTO1);
		shoppinggService.ValidateAndSave(shoppinggDTO2);
		shoppinggService.ValidateAndSave(shoppinggDTO3);
		shoppinggService.ValidateAndSave(shoppinggDTO4);

		System.out.println("read start++++++++++");
		shoppinggService.ReadDTO();
		System.out.println("read end----------");

		System.out.println("read start++++++++++");
		shoppinggService.ReadDTO1();
		System.out.println("read end----------");

		System.out.println("update start--------");
		shoppinggService.UpdateDTO(1);
		System.out.println("update end-----------");

		System.out.println("update start--------");
		shoppinggService.UpdateDTO1(22);
		System.out.println("update end-----------");

		System.out.println("update start--------");
		shoppinggService.UpdateDTO2("belagavi");
		System.out.println("update end-----------");
		
		shoppinggService.DeleteDTO(33);
		shoppinggService.DeleteDTO1(2);
	}

}
