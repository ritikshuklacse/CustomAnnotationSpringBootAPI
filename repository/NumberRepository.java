package com.example.demoAnnotation.repository;

import com.example.demoAnnotation.entity.Number;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NumberRepository extends CrudRepository<Number, Integer> {

}
