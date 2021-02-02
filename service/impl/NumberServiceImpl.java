package com.example.demoAnnotation.service.impl;

import com.example.demoAnnotation.dto.NumberDTO;
import com.example.demoAnnotation.entity.Number;
import com.example.demoAnnotation.repository.NumberRepository;
import com.example.demoAnnotation.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Scanner;
import java.util.Set;

@Service
public class NumberServiceImpl implements NumberService {

    @Autowired
    NumberRepository numberRepository;

    @Override
    public int save(NumberDTO numberDTO) {
        Number number = new Number();
        number.setNumber(numberDTO.getNum());
        return numberRepository.save(number).getNumber();
    }
}
