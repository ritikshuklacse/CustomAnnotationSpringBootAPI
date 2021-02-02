package com.example.demoAnnotation.customAnnotation;

import com.example.demoAnnotation.customAnnotation.CheckOdd;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NumberValidation implements ConstraintValidator<CheckOdd, Integer> {
    private static boolean required;

    public static boolean validate(int num) {
        if(num%2==0){
            required = false;
            System.out.println(num);
            return required;
        }
        else{
            System.out.println(num);
            required = true;
            return required;
        }
    }

    @Override
    public void initialize(CheckOdd gap) {
        // No-op.
    }

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        try{
            return validate(integer);

        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
//        System.out.println("inside isValid");
//        return validate(integer);


    }
}
