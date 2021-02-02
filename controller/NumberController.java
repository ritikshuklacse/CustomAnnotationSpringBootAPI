package com.example.demoAnnotation.controller;

import com.example.demoAnnotation.dto.NumberDTO;
import com.example.demoAnnotation.entity.Number;
import com.example.demoAnnotation.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/check")
public class NumberController {

    @Autowired
    NumberService numberService;

    @PostMapping
    @ResponseBody
    public int save(@RequestBody @Valid NumberDTO numberDTO){
        return numberService.save(numberDTO);
    }

}
