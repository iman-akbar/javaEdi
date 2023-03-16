package com.example.EDI2.demo.controller;

import com.example.EDI2.demo.model.tblUser;
import com.example.EDI2.demo.repository.ediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/api")
public class ediController {
    @Autowired

    private ediRepository Repository;


    @GetMapping(path="/all")
    public @ResponseBody Iterable<tblUser> getAllUsers() {

        return Repository.findAll();
    }
}
