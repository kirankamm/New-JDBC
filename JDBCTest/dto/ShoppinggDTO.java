package com.xworkz.shoppingg.app.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class ShoppinggDTO {

	private int emailId;
	
	@NotBlank
	@NotEmpty
	@NotNull
	@Size(min=1,max=30)
	private String name;
	private String qualification;
	private int contacte_No;
	private String location;
	private int id;

	
	
}
