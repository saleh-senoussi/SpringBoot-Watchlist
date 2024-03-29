package com.openclassrooms.watchlist.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RatingValidator implements ConstraintValidator<Rating, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		boolean bool = false;
		
		try {
			double val = Double.parseDouble(value);
			if (val > 1.0  && val < 10.0) {
				bool = true;
			}
		} catch (Exception e) {
			
		} finally {
			return bool;
		}
	}
	

}
