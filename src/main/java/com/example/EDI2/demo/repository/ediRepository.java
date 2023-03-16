package com.example.EDI2.demo.repository;

import com.example.EDI2.demo.model.tblUser;
import org.springframework.data.repository.CrudRepository;

public interface ediRepository extends CrudRepository<tblUser, Integer> {
}
