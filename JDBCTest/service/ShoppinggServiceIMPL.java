package com.xworkz.shoppingg.app.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.shoppingg.app.dto.ShoppinggDTO;
import com.xworkz.shoppingg.app.repository.ShoppinggRepository;

public class ShoppinggServiceIMPL implements ShoppinggService  {

	ShoppinggRepository shoppinggRepository;
	
	
	public  ShoppinggServiceIMPL(ShoppinggRepository shoppinggRepository) {
		this.shoppinggRepository= shoppinggRepository;
	}
	
	
	@Override
	public boolean ValidateAndSave(ShoppinggDTO dto) {
		// TODO Auto-generated method stub
		
		if (dto !=null) {
			
			ValidatorFactory validatorFactory=Validation.buildDefaultValidatorFactory();
			Validator validator=validatorFactory.getValidator();
			
	 Set<ConstraintViolation<ShoppinggDTO>> constraintViolation=validator.validate(dto);
	 
	 if (constraintViolation.isEmpty()) {
		
		
		
		  boolean save =this.shoppinggRepository.onSave(dto);		
			System.out.println(save);
	} else {
		
		System.out.println(constraintViolation.toString());
	}
		
			
		} else {
System.out.println("dto is empty");
		}
		return true;
	}

	@Override
	public boolean UpdateDTO(int emailId) {
		// TODO Auto-generated method stub
		
		if (emailId!=0) {
			boolean Update=this.shoppinggRepository.onUpdate(emailId); 
			System.out.println(Update);
		} else {
        System.out.println("not update");
		}
		
		return true;
	}

	
	
	@Override
	public boolean DeleteDTO(int emailId) {
		// TODO Auto-generated method stub
		
		if (emailId!=0) {
			boolean Update=this.UpdateDTO(emailId); 
			System.out.println(Update);
		} else {
        System.out.println("not update");
		}
		
		return true;
	}

	@Override
	public boolean UpdateDTO1(int id) {
		// TODO Auto-generated method stub
		if (id!=0) {
			boolean Update=this.shoppinggRepository.onUpdate1(id); 
			System.out.println(Update);
		} else {
        System.out.println("not update");
		}
		
		return true;
	}

	@Override
	public boolean UpdateDTO2(String name) {
		// TODO Auto-generated method stub
		if (name!=null) {
			boolean Update=this.shoppinggRepository.onUpdate2(name); 
			System.out.println(Update);
		} else {
        System.out.println("not update");
		}
		
		return true;
	}

	
	@Override
	public boolean DeleteDTO1(int id) {
		// TODO Auto-generated method stub
		if (id!=0) {
			boolean Update=this.UpdateDTO1(id); 
			System.out.println(Update);
		} else {
        System.out.println("not update");
		}
		
		return true;
	}

	@Override
	public boolean ReadDTO() {
		// TODO Auto-generated method stub
		boolean readd=this.shoppinggRepository.onRead();
		return true;
	}

	@Override
	public boolean ReadDTO1() {
		// TODO Auto-generated method stub
		boolean readd=this.shoppinggRepository.onRead1();
		return true;
	}

	

	

}
